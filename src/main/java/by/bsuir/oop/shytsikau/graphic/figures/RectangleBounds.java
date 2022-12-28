package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

/**
 * A class that represents rectangular attributes of a figure - with and height. Can be used for figures that size parameters
 * can be represented as rectangle (ellipse, triangle, rectangle etc.)
 */
public abstract class RectangleBounds extends AbstractFigure implements Cloneable {

    protected int width;
    protected int height;

    public RectangleBounds(Point startPoint, int width, int height) {
        super(startPoint);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public RectangleBounds clone() {
        return (RectangleBounds) super.clone();
    }
}
