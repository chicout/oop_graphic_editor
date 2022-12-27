package by.bsuir.oop.shytsikau.graphic.figures.composite;

import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;

public class IsoscelesTriangle extends Polygon {

    public IsoscelesTriangle(Point point1, int width, int height) {
        super(point1, width, height);
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
}
