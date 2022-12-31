package by.bsuir.oop.shytsikau.graphic.api.collections;

import by.bsuir.oop.shytsikau.graphic.api.Figure;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Extension of java arraylist of Figures
 * @see Figure
 */
public class FigureList extends ArrayList<Figure> implements Externalizable {

    public FigureList(Collection<? extends Figure> c) {
        super(c);
    }

    public FigureList() {
    }

    /**
     * Get figure by its name
     * @param name name of a figure
     * @return figure that has the name
     */
    public Figure getFigure(String name) {
        return this.stream().filter(figure -> figure.name().equals(name)).findFirst().get();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(this.size());
        for (Figure figure : this) {
            out.writeObject(figure);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int count = (int) in.readInt();
        for (int i = 0; i < count; i++) {
            Figure obj = (Figure) in.readObject();
            this.add(obj);
        }
    }
}
