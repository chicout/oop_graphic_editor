package by.bsuir.oop.shytsikau.graphic.figures;

import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.Point;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/**
 * A class that represents starting point of a figure (aka anchor).
 */
public abstract class AbstractFigure implements Figure, Cloneable, Externalizable {

    /**
     * An anchor point of a figure
     */
    protected Point startPoint;
    protected ArrayList<FigureTransformer> transformers = new ArrayList<>();

    public AbstractFigure(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    @Override
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        recalculatePoints();
    }

    @Override
    public void moveRelative(Point newLocation) {
        startPoint.add(newLocation);
        transformers.stream().forEach(transformer -> transformer.moveRelative(newLocation));
    }

    @Override
    public void addTransformer(FigureTransformer transformer) {
        this.transformers.add(transformer);
    }

    public Point[] transform(Point point) {
        Point newPoint = point;
        for (FigureTransformer transformer : transformers) {
            newPoint = transformer.transform(newPoint);
        }
        return new Point[]{newPoint};
    }

    @Override
    public AbstractFigure clone() {
        try {
            AbstractFigure clone = (AbstractFigure) super.clone();
            clone.startPoint = new Point(this.startPoint);
            clone.transformers = new ArrayList<>(transformers);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(startPoint);
        out.writeInt(transformers.size());
        for (FigureTransformer transformer : transformers) {
            out.writeObject(transformer);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.startPoint = (Point) in.readObject();
        int count = in.readInt();
        for (int i = 0; i < count; i++) {
            this.transformers.add((FigureTransformer) in.readObject());
        }
    }
}
