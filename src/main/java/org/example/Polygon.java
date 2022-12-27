package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Polygon extends Polyline {

    public Polygon(Point... point) {
        super(point);
        if (point.length < 3) {
            throw new IllegalArgumentException("Polyline must have at least three points");
        }
    }

    @Override
    public FigureList getFigures() {
        FigureList lines = super.getFigures();
        lines.add(new LineSegment(getPoints().get(getPoints().size() - 1), getPoints().get(0)));
        return lines;
    }
}
