package by.bsuir.oop.shytsikau.graphic.figures.basic;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;

/**
 * A class that represents point.
 */
public class Point implements Figure, Cloneable {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point old) {
        this.x = old.x;
        this.y = old.y;
    }

    @Override
    public String name() {
        return "point";
    }

    public void add(Point movePoint) {
        this.x = this.x + movePoint.getX();
        this.y = this.y + movePoint.getY();
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

    @Override
    public void moveRelative(Point relPoint) {
        add(relPoint);
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
