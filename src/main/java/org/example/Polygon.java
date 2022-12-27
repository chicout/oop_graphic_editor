package org.example;

public abstract class Polygon extends Polyline {

    public Polygon(Point startPoint, Point... point) {
        super(startPoint, point);
    }

    public Polygon(Point startPoint, int width, int height) {
        super(startPoint, width, height);
        init();
    }

    public void init() {
        setPoints(makePoints());
    }

    protected abstract PointArray makePoints();

    @Override
    public FigureList getFigures() {
        if (points.size() < 3) {
            throw new IllegalStateException("Poligon must have at least 3 points");
        }
        FigureList lines = super.getFigures();
        lines.add(new LineSegment(getPoints().get(getPoints().size() - 1), getPoints().get(0)));
        return lines;
    }
}
