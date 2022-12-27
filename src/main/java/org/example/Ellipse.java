package org.example;

public class Ellipse implements Figure {
    private Point point1;
    private int width;
    private int height;

    public Ellipse(Point point1, int width, int height) {
        this.point1 = point1;
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return "ellipse";
    }

    @Override
    public int[] getY(int x) {
        return getCoordinate(x, width, height, point1.getX(), point1.getY());
    }

    @Override
    public int[] getX(int y) {
        return getCoordinate(y, height, width, point1.getY(), point1.getX());
    }

    private int[] getCoordinate(int coord1, int coord1Scale, int coord2Scale, int startPointCoord1, int startPointCoord2) {
        if (coord1 < Math.min(startPointCoord1, startPointCoord1 + coord1Scale) || coord1 > Math.max(startPointCoord1, startPointCoord1 + coord1Scale)) {
            return new int[0];
        }
        double a = (double) coord1Scale / 2;
        double b = (double) coord2Scale / 2;
        int coord2 = (int) (Math.sqrt(Math.pow(b, 2) / Math.pow(a, 2) * (Math.pow(a, 2) - Math.pow(coord1 - (a + startPointCoord1), 2))));
        return new int[]{(int) (coord2 + (b + startPointCoord2)), (int) (-coord2 + (b + startPointCoord2))};
    }
}
