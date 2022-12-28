package by.bsuir.oop.shytsikau.graphic.ui;

import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class GraphicEditorComponent extends JComponent {

    private final FigureList figures;

    public GraphicEditorComponent(FigureList figures) {
        this.figures = figures;
    }

    // using Java graphic AWT library method for painting component
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        // for each figure
        figures.forEach(figure -> {
            // traverse X coordinate of the component
            for (int x = 0; x <= getWidth(); x++) {
                // get Y coordinates of a figure for the X
                int[] y = figure.getY(x);
                int finalX = x;
                // for each Y coordinate and give X coordinate - draw dot (pixel)
                Arrays.stream(y).forEach(coordinate -> drawDot(g, finalX, coordinate));
            }
            // the same need to do traversing Y coordinate of the canvas - because if line has more than 45 angle than drawing will be inaccurate
            // because traversing was only for X coordinate
            for (int y = 0; y <= getHeight(); y++) {
                int[] x = figure.getX(y);
                int finalY = y;
                Arrays.stream(x).forEach(coordinate -> drawDot(g, coordinate, finalY));
            }
        });
    }

    // draw dot using Java library
    public void drawDot(Graphics g, int x, int y) {
        g.drawLine(x, y, x, y);
    }
}