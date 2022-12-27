package org.example;

public class Rectangle extends Polygon {

    private Point point;
    private int width;
    private int height;

    public Rectangle(Point point, int width, int height) {
        this(makePoints(point, width, height));
        this.point = point;
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return "rectangle";
    }

    private Rectangle(Point... points) {
        super(points);
    }

    private static Point[] makePoints(Point point1, int width, int height) {
        return new Point[]{point1, new Point(point1.getX() + width, point1.getY()), new Point(point1.getX() + width, point1.getY() + height), new Point(point1.getX(), point1.getY() + height)};
    }
}
