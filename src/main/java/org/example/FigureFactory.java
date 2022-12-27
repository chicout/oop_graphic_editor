package org.example;

public class FigureFactory {

    public static Figure getFigure(FigureList list, String name) {
        return list.stream().filter(figure -> figure.name().equals(name)).findFirst().get();
    }
}
