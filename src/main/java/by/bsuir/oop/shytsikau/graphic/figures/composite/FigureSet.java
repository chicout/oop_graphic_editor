package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.CompositeFigure;
import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

import java.util.Arrays;

/**
 * Default implementation of CompositeFigure
 * @see CompositeFigure
 */
public class FigureSet implements CompositeFigure, Cloneable {

    private FigureList figures;

    public FigureSet(Figure... figures) {
        this.figures = new FigureList(Arrays.asList(figures));
    }

    public FigureSet(FigureList figures) {
        this.figures = figures;
    }

    @Override
    public FigureList getFigures() {
        return figures;
    }

    @Override
    public FigureSet clone() {
        try {
            FigureSet clone = (FigureSet) super.clone();
            FigureList newFigures = new FigureList();
            newFigures.addAll(this.figures.stream().map(figure -> (Figure) figure.clone()).toList());
            clone.figures = newFigures;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
