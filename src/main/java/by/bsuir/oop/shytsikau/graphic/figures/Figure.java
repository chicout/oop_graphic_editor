package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

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

    /**
     * Move the figure adding coordinates to current location
     * @param relPoint relative point to add to current location
     */
    void moveRelative(Point relPoint);

    void resize(double factor);

    /**
     * Cloning the figure
     * @return deep copy of the figure
     */
    Figure clone();

    // default methods for figure builder - figure implementation is allowed not to implement them
    default void setPoints(PointArray points){}
    default void setAngle(double angle) {}
    default void setWidth(int width) {}
    default void setHeight(int height) {}

    Point getStartPoint();

    default void setStartPoint(Point startPoint) {}

    default void recalculatePoints() {}
}
