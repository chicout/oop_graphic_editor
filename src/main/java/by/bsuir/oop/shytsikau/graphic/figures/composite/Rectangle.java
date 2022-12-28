package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

/**
 * A class that represents rectangle. This is Parallelogram with 90 angle
 * @see Parallelogram
 */
public class Rectangle extends Parallelogram {

    /**
     *
     * @param point anchor point of a rectangle
     * @param width width of a rectangle
     * @param height height diameter of a rectangle
     */
    public Rectangle(Point point, int width, int height) {
        // using parallelogram constructor with 90 angle
        super(point, width, height, 90);
    }

    @Override
    public String name() {
        return "rectangle";
    }
}
