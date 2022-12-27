package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

public class FigureFactory {

    public static Figure getFigure(FigureList list, String name) {
        return list.stream().filter(figure -> figure.name().equals(name)).findFirst().get();
    }
}
