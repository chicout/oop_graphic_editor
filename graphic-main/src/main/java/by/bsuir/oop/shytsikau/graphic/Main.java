package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.ui.EditorFrame;
import by.bsuir.oop.shytsikau.graphic.ui.GraphicEditorComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ServiceLoader;

public class Main {

    private final static int PAINT_WIDTH = 1024;
    private final static int PAINT_HEIGHT = 720;

    private final static FigureList figures = new FigureList();

    // static initialization
    static {
        ServiceLoader<Figure> serviceLoader = ServiceLoader.load(Figure.class);
        serviceLoader.stream().forEach(figureProvider -> figures.add(figureProvider.get()));

        int y = 20;
        for (Figure figure : figures) {
            figure.moveRelative(new Point(50, y));
            y += 130;
        }
    }

    public static void main(String[] args) {
        // create UI
        // create painting canvas
        final GraphicEditorComponent comp = new GraphicEditorComponent(figures);
        comp.setPreferredSize(new Dimension(PAINT_WIDTH, PAINT_HEIGHT));

        JFrame testFrame = new EditorFrame(comp);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.getContentPane().setBackground(new Color(255, 255, 255));

        testFrame.pack();
        testFrame.setVisible(true);
    }
}