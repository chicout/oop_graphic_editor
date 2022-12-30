package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * A class that represents rectangular attributes of a figure - with and height. Can be used for figures that size parameters
 * can be represented as rectangle (ellipse, triangle, rectangle etc.)
 */
public abstract class RectangleBounds extends AbstractFigure implements Cloneable, Externalizable {

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
    public void resize(double factor) {
        this.height = (int) (this.height * factor);
        this.width = (int) (this.width * factor);
        recalculatePoints();
    }

    @Override
    public RectangleBounds clone() {
        return (RectangleBounds) super.clone();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeInt(width);
        out.writeInt(height);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        this.width = in.readInt();
        this.height = in.readInt();
    }
}
