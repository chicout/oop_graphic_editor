package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

/**
 * A class that represents starting point of a figure (aka anchor).
 */
public abstract class AbstractFigure implements Figure, Cloneable {

    /**
     * An anchor point of a figure
     */
    protected Point startPoint;

    public AbstractFigure(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

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
}
