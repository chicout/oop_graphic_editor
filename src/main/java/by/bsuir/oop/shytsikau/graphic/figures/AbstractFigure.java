package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * A class that represents starting point of a figure (aka anchor).
 */
public abstract class AbstractFigure implements Figure, Cloneable, Externalizable {

    /**
     * An anchor point of a figure
     */
    protected Point startPoint;

    public AbstractFigure(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    @Override
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        recalculatePoints();
    }

    @Override
    public void moveRelative(Point newLocation) {
        startPoint.add(newLocation);
    }

    @Override
    public AbstractFigure clone() {
        try {
            AbstractFigure clone = (AbstractFigure) super.clone();
            clone.startPoint = new Point(this.startPoint);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(startPoint);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.startPoint = (Point) in.readObject();
    }
}
