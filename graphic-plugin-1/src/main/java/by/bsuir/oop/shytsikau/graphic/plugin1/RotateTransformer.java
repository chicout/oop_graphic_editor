package by.bsuir.oop.shytsikau.graphic.plugin1;

import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.composite.FigureSet;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class RotateTransformer implements FigureTransformer, Cloneable, Externalizable {

    private AffineTransform affineTransform;
    private double angle;
    private double anchorx;
    private double anchory;

    @Override
    public String name() {
        return "rotate";
    }

    @Override
    public String getExampleParams() {
        return "name,angle,pointX,pointY";
    }

    @Override
    public FigureSet init(Figure figure, String params) {
        String[] paramsArr = params.split(",");
        this.angle = Double.parseDouble(paramsArr[1]);
        this.anchorx = Double.parseDouble(paramsArr[2]);
        this.anchory = Double.parseDouble(paramsArr[3]);
        this.affineTransform = AffineTransform.getRotateInstance(Math.toRadians(angle), anchorx, anchory);
        FigureSet newFigure = new FigureSet(paramsArr[0]);

        Figure transformed = figure.clone();
        transformed.addTransformer(this);

        newFigure.addFigure(figure.clone());
        newFigure.addFigure(transformed);

        return newFigure;
    }

    @Override
    public Point transform(Point point) {
        Point2D result = this.affineTransform.transform(new java.awt.Point(point.getX(), point.getY()), null);
        return new Point((int) result.getX(), (int) result.getY());
    }

    @Override
    public RotateTransformer clone() {
        try {
            RotateTransformer clone = (RotateTransformer) super.clone();
            clone.affineTransform = null;
            clone.angle = this.angle;
            clone.anchorx = this.anchorx;
            clone.anchory = this.anchory;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void moveRelative(Point newLocation) {
        Point newP = new Point((int) anchorx, (int) anchory);
        newP.moveRelative(newLocation);
        this.anchorx = newP.getX();
        this.anchory = newP.getY();
        this.affineTransform = AffineTransform.getRotateInstance(Math.toRadians(angle), anchorx, anchory);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.affineTransform);
        out.writeDouble(this.angle);
        out.writeDouble(this.anchorx);
        out.writeDouble(this.anchory);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.affineTransform = (AffineTransform) in.readObject();
        this.angle = in.readDouble();
        this.anchorx = in.readDouble();
        this.anchory = in.readDouble();
    }
}
