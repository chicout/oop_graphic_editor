package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

/**
 * An interface that describes a figure behavior
 * @author Pavel Shytsikau
 */
public interface Figure {
    default String name() {
        return "default";
    }

    /**
     * Calculates a figure Y-axis coordinates for given X-axis coordinate
     * @param x X-axis coordinate
     * @return array of Y-axis coordinates
     */
    int[] getY(int x);

    /**
     * Calculates a figure X-axis coordinates for given Y-axis coordinate
     * @param y Y-axis coordinate
     * @return array of X-axis coordinates
     */
    int[] getX(int y);

    void moveRelative(Point newLocation);

}
