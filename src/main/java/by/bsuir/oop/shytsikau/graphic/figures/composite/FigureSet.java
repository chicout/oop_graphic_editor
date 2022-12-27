package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.CompositeFigure;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

/**
 * Default implementation of CompositeFigure
 * @see CompositeFigure
 */
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
