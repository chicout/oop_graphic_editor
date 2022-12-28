package by.bsuir.oop.shytsikau.graphic.figures.collections;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Extension of java arraylist of Points
 * @see Point
 */
public class PointArray extends ArrayList<Point> {

    public PointArray(Collection<? extends Point> c) {
        super(c);
    }

    public PointArray() {

    }
}
