package org.example;

public class LineSegment implements Figure {
    private Point point1, point2;

    public LineSegment() {
        this.point1 = new Point(50, 50);
        this.point2 = new Point(70, 500);
    }

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String name() {
        return "segment";
    }

    public int[] getY(int x) {
        if (x < Math.min(point1.getX(), point2.getX()) || x > Math.max(point1.getX(), point2.getX())) {
            return new int[0];
        }
        if (point2.getX() - point1.getX() == 0) {
            int size = Math.abs(point2.getY() - point1.getY()) + 1;
            int[] y = new int[size];
            int point = Math.min(point1.getY(), point2.getY());
            for (int i = 0; i < size; i++) {
                y[i] = point++;
            }
            return y;
        }
        return new int[]{(x - point1.getX()) * (point2.getY() - point1.getY()) / (point2.getX() - point1.getX()) + point1.getY()};
    }

    @Override
    public int[] getX(int y) {
        if (y < Math.min(point1.getY(), point2.getY()) || y > Math.max(point1.getY(), point2.getY())) {
            return new int[0];
        }
        if (point2.getY() - point1.getY() == 0) {
            int size = Math.abs(point2.getX() - point1.getX()) + 1;
            int[] x = new int[size];
            int point = Math.min(point1.getX(), point2.getX());
            for (int i = 0; i < size; i++) {
                x[i] = point++;
            }
            return x;
        }
        return new int[]{(y - point1.getY()) * (point2.getX() - point1.getX()) / (point2.getY() - point1.getY()) + point1.getX()};
    }
}
