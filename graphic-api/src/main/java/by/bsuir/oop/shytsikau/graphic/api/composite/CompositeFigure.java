package by.bsuir.oop.shytsikau.graphic.api.composite;

import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.collections.FigureList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    default void moveRelative(Point relPoint){
        getFigures().forEach(figure -> figure.moveRelative(relPoint));
    }

    @Override
    default void resize(double factor) {
        getFigures().forEach(figure -> figure.resize(factor));
    }

    @Override
    default void addTransformer(FigureTransformer transformer) {
        getFigures().forEach(figure -> figure.addTransformer(transformer));
    }

    @Override
    default Point[] transform(Point point) {
        List<Point> newPoint = new ArrayList<>();
        for (Figure figure : getFigures()) {
            newPoint.addAll(Arrays.asList(figure.transform(point)));
        }
        return newPoint.toArray(new Point[0]);
    }

    @Override
    default void setStartPoint(Point startPoint) {
        Point minusStart = new Point(-1 * getStartPoint().getX(), -1 * getStartPoint().getY());
        getFigures().stream().forEach(figure -> {
            figure.moveRelative(minusStart);
            figure.moveRelative(startPoint);
        });
    }

    /**
     * Set anchor point of figure - for composite the anchor point is first added figure anchor point
     * @return anchor point for the figure
     */
    @Override
    default Point getStartPoint() {
        return getFigures().get(0).getStartPoint();
    }

    FigureList getFigures();
}
