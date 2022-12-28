package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Ellipse;
import by.bsuir.oop.shytsikau.graphic.figures.basic.LineSegment;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.composite.FigureSet;
import by.bsuir.oop.shytsikau.graphic.figures.composite.IsoscelesTriangle;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Parallelogram;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Rectangle;
import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.ui.GraphicEditorComponent;

import javax.swing.*;
import java.awt.*;

public class Main {

    private final static int PAINT_WIDTH = 1024;
    private final static int PAINT_HEIGHT = 720;

    private final static FigureList figures = new FigureList();

    // static initialization
    static {
        // create figures objects for the current task
        Figure line = new LineSegment(new Point(), new Point(300, 50));
        Figure ellipse = new Ellipse(new Point(), 300, 100);
        Figure rectangle = new Rectangle(new Point(), 300, 100);
        Figure isoscelesTriangle = new IsoscelesTriangle(new Point(), 100, 200);
        Figure parallelogram = new Parallelogram(new Point(), 300, 100, 45);

        // add the objects to static figure list
        figures.add(line);
        figures.add(ellipse);
        figures.add(rectangle);
        figures.add(isoscelesTriangle);
        figures.add(parallelogram);


        // move to appropriate place relatively to (0,0)
        line.moveRelative(new Point(100, 30));
        ellipse.moveRelative(new Point(100, 100));
        rectangle.moveRelative(new Point(100, 225));
        isoscelesTriangle.moveRelative(new Point(100, 350));
        parallelogram.moveRelative(new Point(100, 600));

        line = (Figure) line.clone();
        ellipse = (Figure) ellipse.clone();
        rectangle = (Figure) rectangle.clone();
        isoscelesTriangle = (Figure) isoscelesTriangle.clone();

        // move to appropriate place relatively to (0,0)
        line.moveRelative(new Point(300, 0));
        ellipse.moveRelative(new Point(300, 0));
        rectangle.moveRelative(new Point(300, 0));
        isoscelesTriangle.moveRelative(new Point(300, 0));

        FigureSet figureSet = new FigureSet(line, ellipse, rectangle, isoscelesTriangle);
        figures.add(figureSet);
        figureSet.moveRelative(new Point(100, 20));

        figureSet = figureSet.clone();

        figures.add(figureSet);
        figureSet.moveRelative(new Point(100, 20));

    }

    public static void main(String[] args) {
        // create UI
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // create painting canvas
        final GraphicEditorComponent comp = new GraphicEditorComponent(figures);
        comp.setPreferredSize(new Dimension(PAINT_WIDTH, PAINT_HEIGHT));

        testFrame.getContentPane().add(comp, BorderLayout.CENTER);
        testFrame.pack();
        testFrame.setVisible(true);
    }
}