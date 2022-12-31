package by.bsuir.oop.shytsikau.graphic.plugin1;

import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.composite.FigureSet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SizeTransformer implements FigureTransformer, Cloneable, Externalizable {

    @Override
    public String name() {
        return "resize";
    }

    @Override
    public String getExampleParams() {
        return "name,size";
    }

    @Override
    public FigureSet init(Figure figure, String params) {
        String[] paramsArr = params.split(",");
        FigureSet newFigure = new FigureSet(paramsArr[0]);

        Figure transformed = figure.clone();
        transformed.resize(Double.parseDouble(paramsArr[1]));

        newFigure.addFigure(figure.clone());
        newFigure.addFigure(transformed);

        return newFigure;
    }

    @Override
    public Point transform(Point point) {
        return point;
    }

    @Override
    public SizeTransformer clone() {
        try {
            SizeTransformer clone = (SizeTransformer) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void moveRelative(Point newLocation) {

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
