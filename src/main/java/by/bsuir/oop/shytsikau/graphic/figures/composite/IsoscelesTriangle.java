package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

import java.io.Externalizable;

/**
 * A class that represents isosceles triangle. The calculation of isosceles triangle coordinates is performed with a polygon logic, the class providing required points
 */
public class IsoscelesTriangle extends Polygon implements Cloneable, Externalizable {

    public IsoscelesTriangle(Point point1, int width, int height) {
        super(point1, width, height);
    }

    public IsoscelesTriangle() {
        super();
    }

    @Override
    public String name() {
        return "isosceles";
    }

    @Override
    protected PointArray makePoints() {
        PointArray pointArray = new PointArray();
        pointArray.add(this.startPoint);
        pointArray.add(new Point(startPoint.getX() + width, startPoint.getY()));
        pointArray.add(new Point(startPoint.getX() + width / 2, startPoint.getY() + height));
        return pointArray;
    }

    @Override
    public IsoscelesTriangle clone() {
        return (IsoscelesTriangle) super.clone();
    }
}
