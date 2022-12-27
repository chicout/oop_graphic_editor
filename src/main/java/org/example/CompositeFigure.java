package org.example;

import java.util.Arrays;

public interface CompositeFigure extends Figure {

    default int[] getY(int x) {
        return getFigures().stream().map(line -> line.getY(x)).filter(y -> y.length != 0).flatMapToInt(Arrays::stream).toArray();
    }

    default int[] getX(int y) {
        return getFigures().stream().map(line -> line.getX(y)).filter(x -> x.length != 0).flatMapToInt(Arrays::stream).toArray();
    }

    FigureList getFigures();
}
