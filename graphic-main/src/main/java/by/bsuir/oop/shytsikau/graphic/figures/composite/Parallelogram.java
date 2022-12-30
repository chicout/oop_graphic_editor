package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * A class that represents parallelogram. The calculation of parallelogram coordinates is performed with a polygon logic, the class providing required points
 */
public class Parallelogram extends Polygon implements Cloneable, Externalizable {

    protected final static double DEFAULT_ANGLE = 70;

    private double angle;

    /**
     *
     * @param startPoint anchor of parallelogram
     * @param width horizontal line length segment of parallelogram
     * @param height vertical line length segment of parallelogram
     * @see RectangleBounds
     */
    public Parallelogram(Point startPoint, int width, int height, double angle) {
        super(startPoint, width, height);
        this.angle = angle;
        recalculatePoints();
    }

    /**
     * Default rectangle with specified angle
     * @param angle angle to set
     */
    public Parallelogram(double angle) {
        super();
        this.angle = angle;
        recalculatePoints();
    }

    /**
     * Default rectangle
     */
    public Parallelogram() {
        super();
        this.angle = DEFAULT_ANGLE;
        recalculatePoints();
    }

    @Override
    public String name() {
        return "parallelogram";
    }

    @Override
    protected PointArray makePoints() {
        // calculation of points of the parallelogram
        PointArray pointArray = new PointArray();
        pointArray.add(this.startPoint);
        Point point2 = new Point(startPoint.getX() + width, startPoint.getY());
        pointArray.add(point2);
        Point point3 = new Point((int) (point2.getX() - height * Math.cos(Math.toRadians(angle))), (int) (point2.getY() + height * Math.sin(Math.toRadians(angle))));
        pointArray.add(point3);
        pointArray.add(new Point(point3.getX() - width, point3.getY()));
        return pointArray;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public Parallelogram clone() {
        return (Parallelogram) super.clone();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeDouble(angle);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        this.angle = in.readDouble();
    }
}
