package by.bsuir.oop.shytsikau.graphic.figures.collections;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Extension of java arraylist of Points
 * @see Point
 */
public class PointArray extends ArrayList<Point> implements Externalizable {

    public PointArray(Collection<? extends Point> c) {
        super(c);
    }

    public PointArray() {

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(this.size());
        for (Point point : this) {
            out.writeObject(point);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int count = (int) in.readInt();
        for (int i = 0; i < count; i++) {
            Point obj = (Point) in.readObject();
            this.add(obj);
        }
    }
}
