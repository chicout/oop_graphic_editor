package org.example;

public class FigureSet implements CompositeFigure {

    private FigureList figures;

    public FigureSet(FigureList figures) {
        this.figures = figures;
    }

    @Override
    public FigureList getFigures() {
        return figures;
    }
}
