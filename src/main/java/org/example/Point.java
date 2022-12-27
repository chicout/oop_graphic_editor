package org.example;

public class Point implements Figure {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String name() {
        return "point";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int[] getY(int x) {
        if (x != this.x)
            return new int[0];
        return new int[]{this.getY()};
    }

    @Override
    public int[] getX(int y) {
        if (y != this.y)
            return new int[0];
        return new int[]{this.getX()};
    }
}
