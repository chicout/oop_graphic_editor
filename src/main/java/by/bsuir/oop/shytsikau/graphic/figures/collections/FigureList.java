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

    /**
     * Get figure by its name
     * @param name name of a figure
     * @return figure that has the name
     */
    public Figure getFigure(String name) {
        return this.stream().filter(figure -> figure.name().equals(name)).findFirst().get();
    }
}
