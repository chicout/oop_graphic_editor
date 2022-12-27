package org.example;

import java.util.Arrays;

public abstract class Polyline implements CompositeFigure {
    private final PointArray points = new PointArray();

    public Polyline(Point... point) {
        if (point.length < 2) {
            throw new IllegalArgumentException("Polyline must have at least two points");
        }
        points.addAll(Arrays.asList(point));
    }

    @Override
    public FigureList getFigures() {
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
