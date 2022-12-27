package org.example;

import java.util.Arrays;

public abstract class Polyline extends RectangleBounds implements CompositeFigure {
    protected PointArray points = new PointArray();

    public Polyline(Point startPoint, Point... point) {
        super(startPoint, -1, -1);
        points.addAll(Arrays.asList(point));
    }

    public Polyline(Point startPoint, int weight, int height) {
        super(startPoint, weight, height);
    }

    public void setPoints(PointArray points) {
        this.points = points;
    }

    @Override
    public FigureList getFigures() {
        if (points.size() < 2) {
            throw new IllegalStateException("Polyline must have at least 2 points");
        }
        FigureList lines = new FigureList();
        for (int i = 1; i < points.size(); i++) {
            lines.add(new LineSegment(points.get(i - 1), points.get(i)));
        }
        return lines;
    }

    public PointArray getPoints() {
        return points;
    }
}
