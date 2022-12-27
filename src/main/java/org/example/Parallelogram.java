package org.example;

public class Parallelogram extends Polygon {

    private double angle;

    public Parallelogram(Point point, int width, int height, double angle) {
        super(point, width, height);
        this.angle = angle;
        init();
    }

    @Override
    public String name() {
        return "parallelogram";
    }

    @Override
    protected PointArray makePoints() {
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
}
