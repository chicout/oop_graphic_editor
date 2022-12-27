package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

import java.util.Arrays;

/**
 * An interface that describes default composite figure behavior: calculating axis of a figure that consist of multiple simple figures.
 * @author Pavel Shytsikau
 */
public interface CompositeFigure extends Figure {

    @Override
    default int[] getY(int x) {
        return getFigures().stream().map(figure -> figure.getY(x)).filter(y -> y.length != 0).flatMapToInt(Arrays::stream).toArray();
    }

    @Override
    default int[] getX(int y) {
        return getFigures().stream().map(figure -> figure.getX(y)).filter(x -> x.length != 0).flatMapToInt(Arrays::stream).toArray();
    }

    @Override
    default void moveRelative(Point newLocation){
        getFigures().forEach(figure -> figure.moveRelative(newLocation));
    }

    FigureList getFigures();
}
