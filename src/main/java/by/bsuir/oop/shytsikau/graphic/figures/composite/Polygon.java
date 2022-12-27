package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.CompositeFigure;
import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;
import by.bsuir.oop.shytsikau.graphic.figures.basic.LineSegment;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

/**
 * A class that represents polygon. The calculation of polyline coordinates is performed with polyline logic (with added closing line)
 * @see CompositeFigure
 * @see PointArray
 * @see FigureList
 */
public abstract class Polygon extends Polyline {

    /**
     * Constructor is used when all the points of polygon is known
     * @param startPoint anchor of polygon
     * @param point array of all polygon points including startPoint
     */
    public Polygon(Point startPoint, Point... point) {
        super(startPoint, point);
    }

    /**
     * Constructor is used when all the points will be calculated from startPoint, width, height arguments
     * @param startPoint anchor of polygon
     * @param width width if child class has rectangle bounds - <b>optional</b>
     * @param height height if child class has rectangle bounds - <b>optional</b>
     * @see RectangleBounds
     */
    public Polygon(Point startPoint, int width, int height) {
        super(startPoint, width, height);
        init();
    }

    /**
     * Initialization of polygon points, can be invoked if points are changed after constructor invocation
     */
    protected void init() {
        setPoints(makePoints());
    }

    /**
     * Calculate points, required for the polygon
     */
    protected abstract PointArray makePoints();

    @Override
    public FigureList getFigures() {
        if (points.size() < 3) {
            throw new IllegalStateException("Polygon must have at least 3 points");
        }
        FigureList lines = super.getFigures();
        // need to add closing line between end and start points
        lines.add(new LineSegment(getPoints().get(getPoints().size() - 1), getPoints().get(0)));
        return lines;
    }
}
