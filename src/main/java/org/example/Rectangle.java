package org.example;

public class Rectangle extends Parallelogram {

    public Rectangle(Point point, int width, int height) {
        super(point, width, height, 90);
    }

    @Override
    public String name() {
        return "rectangle";
    }

}
