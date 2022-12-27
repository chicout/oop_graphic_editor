package org.example;

public class IsoscelesTriangle extends Polygon {

    private Point point;
    private int width;
    private int height;

    public IsoscelesTriangle(Point point1, int width, int height) {
        this(makePoints(point1, width, height));
        this.point = point1;
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return "isosceles";
    }

    private IsoscelesTriangle(Point... points) {
        super(points);
    }

    private static Point[] makePoints(Point point1, int width, int height) {
        return new Point[]{point1, new Point(point1.getX() + width, point1.getY()), new Point(point1.getX() + width/2, point1.getY() + height)};
    }
}
