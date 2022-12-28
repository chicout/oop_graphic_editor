package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

/**
 * A class that represents parallelogram. The calculation of parallelogram coordinates is performed with a polygon logic, the class providing required points
 */
public class Parallelogram extends Polygon implements Cloneable {

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
}
