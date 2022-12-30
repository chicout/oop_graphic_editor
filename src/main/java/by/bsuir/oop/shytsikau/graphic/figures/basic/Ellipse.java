package by.bsuir.oop.shytsikau.graphic.figures.basic;

import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * A class that represents ellipse. The calculation of ellipse coordinates is performed with canonical ellipse equation <i>x<sup>2</sup> / a<sup>2</sup> + y<sup>2</sup> / b<sup>2</sup> = 1</i>
 */
public class Ellipse extends RectangleBounds implements Cloneable, Externalizable {

    public Ellipse() {
        super();
    }

    /**
     *
     * @param startPoint anchor point of an ellipse
     * @param width X-axis diameter of an ellipse
     * @param height Y-axis diameter of an ellipse
     */
    public Ellipse(Point startPoint, int width, int height) {
        super(startPoint, width, height);
    }

    @Override
    public String name() {
        return "ellipse";
    }

    @Override
    public int[] getY(int x) {
        return getCoordinate(x, width, height, startPoint.getX(), startPoint.getY());
    }

    @Override
    public int[] getX(int y) {
        return getCoordinate(y, height, width, startPoint.getY(), startPoint.getX());
    }

    // as mentioned in the class Javadoc, ellipse coordinates are calculated with canonical ellipse equation
    private int[] getCoordinate(int axis1Coord, int axis1Diameter, int axis2Diameter, int startPointCoord1, int startPointCoord2) {
        if (axis1Coord < Math.min(startPointCoord1, startPointCoord1 + axis1Diameter) || axis1Coord > Math.max(startPointCoord1, startPointCoord1 + axis1Diameter)) {
            return new int[0];
        }
        double a = (double) axis1Diameter / 2;
        double b = (double) axis2Diameter / 2;
        int coord2 = (int) (Math.sqrt(Math.pow(b, 2) / Math.pow(a, 2) * (Math.pow(a, 2) - Math.pow(axis1Coord - (a + startPointCoord1), 2))));
        return new int[]{(int) (coord2 + (b + startPointCoord2)), (int) (-coord2 + (b + startPointCoord2))};
    }

    @Override
    public Ellipse clone() {
        return (Ellipse) super.clone();
    }
}
