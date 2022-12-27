package org.example;

public abstract class AbstractFigure implements Figure {
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
}
