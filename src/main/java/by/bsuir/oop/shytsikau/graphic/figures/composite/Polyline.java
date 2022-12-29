package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.CompositeFigure;
import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;
import by.bsuir.oop.shytsikau.graphic.figures.basic.LineSegment;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

import java.util.Arrays;

/**
 * A class that represents polyline. The calculation of polyline coordinates is performed with a composite figure consisting of several lines
 * @see CompositeFigure
 * @see PointArray
 * @see FigureList
 */
public abstract class Polyline extends RectangleBounds implements CompositeFigure, Cloneable {

    /**
     * Stores an array of polyline points
     */
    protected PointArray points = new PointArray();

    /**
     *
     * @param startPoint anchor of polyline
     * @param point array of all polyline points including startPoint
     */
    public Polyline(Point startPoint, Point... point) {
        super(startPoint, -1, -1);
        points.addAll(Arrays.asList(point));
    }

    /**
     *
     * @param startPoint anchor of polyline
     * @param width width if child class has rectangle bounds - <b>optional</b>
     * @param height height if child class has rectangle bounds - <b>optional</b>
     * @see RectangleBounds
     */
    public Polyline(Point startPoint, int width, int height) {
        super(startPoint, width, height);
    }

    public Polyline() {
        super();
    }

    @Override
    public FigureList getFigures() {
        if (points.size() < 2) {
            throw new IllegalStateException("Polyline must have at least 2 points");
        }
        // create list of lines with the array points, for polyline end point and start point are not connected by line
        FigureList lines = new FigureList();
        for (int i = 1; i < points.size(); i++) {
            lines.add(new LineSegment(points.get(i - 1), points.get(i)));
        }
        return lines;
    }

    public void setPoints(PointArray points) {
        this.points = points;
    }

    public PointArray getPoints() {
        return points;
    }

    @Override
    public Polyline clone() {
        Polyline clone = (Polyline) super.clone();
        PointArray newPoints = new PointArray();
        newPoints.addAll(this.points.stream().map(Point::new).toList());
        clone.points = newPoints;
        return clone;
    }
}
