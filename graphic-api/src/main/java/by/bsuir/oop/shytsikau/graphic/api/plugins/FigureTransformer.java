package by.bsuir.oop.shytsikau.graphic.api.plugins;

import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.composite.FigureSet;

/**
 * An interface that declares a Figure Transformer. Plugins can implement the interface to be included in UI and work on back-end
 * @author Pavel Shytsikau
 */
public interface FigureTransformer {

    /**
     *
     * @return name of figure transformer plugin
     */
    String name();

    /**
     *
     * @return String that describe plugin init params
     */
    String getExampleParams();

    /**
     *
     * @param figure figure to be transformed
     * @param params init params
     * @return resulted figure after transformation
     */
    FigureSet init(Figure figure, String params);

    /**
     *
     * @param point point to be transformed
     * @return resulted point
     */
    Point transform(Point point);

    FigureTransformer clone();

    void moveRelative(Point newLocation);
}
