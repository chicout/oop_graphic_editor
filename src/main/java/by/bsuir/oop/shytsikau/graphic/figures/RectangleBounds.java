package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

/**
 * A class that represents rectangular attributes of a figure - with and height. Can be used for figures that size parameters
 * can be represented as rectangle (ellipse, triangle, rectangle etc.)
 */
public abstract class RectangleBounds extends AbstractFigure implements Cloneable {

    protected final static int DEFAULT_WIDTH = 300;
    protected final static int DEFAULT_HEIGHT = 100;

    protected int width;
    protected int height;

    public RectangleBounds() {
        super(new Point());
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

    public RectangleBounds(Point startPoint) {
        super(startPoint);
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

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
        recalculatePoints();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        recalculatePoints();
    }

    @Override
    public RectangleBounds clone() {
        return (RectangleBounds) super.clone();
    }
}
