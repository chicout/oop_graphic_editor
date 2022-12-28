package by.bsuir.oop.shytsikau.graphic.figures.basic;

import by.bsuir.oop.shytsikau.graphic.figures.AbstractFigure;

/**
 * A class that represents line segment. The calculation of parallelogram coordinates is performed with canonical line equation <i>(x - x<sup>1</sup>)  / (x<sup>2</sup> - x<sup>1</sup>) = (y - y<sup>1</sup>)  / (y<sup>2</sup> - y<sup>1</sup></i>)
 */
public class LineSegment extends AbstractFigure implements Cloneable {
    private Point point2;

    public LineSegment(Point startPoint, Point point2) {
        super(startPoint);
        this.point2 = point2;
    }

    @Override
    public String name() {
        return "segment";
    }

    private int[] getCoordinate(int axis1Coord, int startPointCoord1, int startPointCoord2, int endPointCoord1, int endPointCoord2) {
        if (axis1Coord < Math.min(startPointCoord1, endPointCoord1) || axis1Coord > Math.max(startPointCoord1, endPointCoord1)) {
            return new int[0];
        }
        if (endPointCoord1 - startPointCoord1 == 0) {
            int size = Math.abs(endPointCoord2 - startPointCoord2) + 1;
            int[] y = new int[size];
            int point = Math.min(startPointCoord2, endPointCoord2);
            for (int i = 0; i < size; i++) {
                y[i] = point++;
            }
            return y;
        }
        return new int[]{(axis1Coord - startPointCoord1) * (endPointCoord2 - startPointCoord2) / (endPointCoord1 - startPointCoord1) + startPointCoord2};
    }

    @Override
    public int[] getY(int x) {
        return getCoordinate(x, startPoint.getX(), startPoint.getY(), point2.getX(), point2.getY());
    }

    @Override
    public int[] getX(int y) {
        return getCoordinate(y, startPoint.getY(), startPoint.getX(), point2.getY(), point2.getX());
    }

    @Override
    public void moveRelative(Point relPoint) {
        super.moveRelative(relPoint);
        this.point2.moveRelative(relPoint);
    }

    @Override
    public LineSegment clone() {
        LineSegment clone = (LineSegment) super.clone();
        clone.point2 = new Point(this.point2);
        return clone;
    }
}
