package by.bsuir.oop.shytsikau.graphic.figures.collections;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Extension of java arraylist of Figures
 * @see Figure
 */
public class FigureList extends ArrayList<Figure> {

    public FigureList(Collection<? extends Figure> c) {
        super(c);
    }

    public FigureList() {

    }
}
