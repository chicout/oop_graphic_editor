package by.bsuir.oop.shytsikau.graphic.api.composite;

import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.collections.FigureList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Default implementation of CompositeFigure. User for creating user custom figures
 * @see CompositeFigure
 */
public class FigureSet implements CompositeFigure, Cloneable, Externalizable {

    private String name;

    private FigureList figures = new FigureList();

    public FigureSet() {
    }

    public FigureSet(String name, Figure... figures) {
        this.name = name;
        this.figures = new FigureList(Arrays.asList(figures));
    }

    public FigureSet(String name, FigureList figures) {
        this.name = name;
        this.figures = figures;
    }

    public FigureSet(String name) {
        this.name = name;
    }

    public void addFigure(Figure e) {
        figures.add(e);
    }

    @Override
    public String name() {
        return "custom: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FigureList getFigures() {
        return figures;
    }

    @Override
    public FigureSet clone() {
        try {
            FigureSet clone = (FigureSet) super.clone();
            FigureList newFigures = new FigureList();
            newFigures.addAll(this.figures.stream().map(figure -> (Figure) figure.clone()).collect(Collectors.toList()));
            clone.figures = newFigures;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeObject(figures);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.figures = (FigureList) in.readObject();
    }
}
