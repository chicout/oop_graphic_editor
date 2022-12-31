package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.ui.EditorFrame;
import by.bsuir.oop.shytsikau.graphic.ui.GraphicEditorComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {

    private final static int PAINT_WIDTH = 1024;
    private final static int PAINT_HEIGHT = 720;

    private final static FigureList figures = new FigureList();
    private final static List<FigureTransformer> plugins = new ArrayList<>();

    // static initialization
    static {
        ServiceLoader<Figure> serviceLoader = ServiceLoader.load(Figure.class);
        serviceLoader.stream().forEach(figureProvider -> figures.add(figureProvider.get()));

        int y = 20;
        for (Figure figure : figures) {
            figure.moveRelative(new Point(50, y));
            y += 130;
        }

        ServiceLoader<FigureTransformer> serviceLoaderTr = ServiceLoader.load(FigureTransformer.class);
        serviceLoaderTr.stream().forEach(pluginProvider -> plugins.add(pluginProvider.get()));
    }

    public static void main(String[] args) {
        // create UI
        // create painting canvas
        final GraphicEditorComponent comp = new GraphicEditorComponent(figures);
        comp.setPreferredSize(new Dimension(PAINT_WIDTH, PAINT_HEIGHT));

        JFrame testFrame = new EditorFrame(comp, plugins);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.getContentPane().setBackground(new Color(255, 255, 255));

        testFrame.pack();
        testFrame.setVisible(true);
    }
}