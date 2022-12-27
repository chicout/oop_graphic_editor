package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Arrays;

public class Main extends JComponent {

    private final static FigureList figures = new FigureList();

    static {
        figures.add(new LineSegment());
        figures.add(new Ellipse(new Point(100, 100), 100, 500));
        figures.add(new Rectangle(new Point(100, 100), 100, 500));
        figures.add(new IsoscelesTriangle(new Point(100, 100), 100, 500));
    }

    public void clearFigures() {
        figures.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        AffineTransform af = AffineTransform.getTranslateInstance(150, 150);
 //       af.concatenate(new AffineTransform(1,0,0,-1,0,4));
//       AffineTransform af = new AffineTransform(1,0,0,-1,0,4);
        af.rotate(Math.toRadians(360), 500, 500);
        AffineTransform finalAf = af;
        figures.forEach(figure -> {
            for (int xx = 0; xx < 1025; xx++) {
                g.setColor(Color.BLACK);
                int[] ys = figure.getY(xx);
                int finalXx = xx;
                Point2D.Double dst = new Point2D.Double();
//                Arrays.stream(ys).forEach(inti -> g.drawLine(finalXx, inti, finalXx, inti));
                Arrays.stream(ys).forEach(inti -> {
                    finalAf.transform(new Point2D.Double(finalXx, inti),dst);
                    g.drawLine((int) dst.getX(), (int) dst.getY(), (int) dst.getX(), (int) dst.getY());
                });
            }
//            for (int yy = 0; yy < 721; yy++) {
//                g.setColor(Color.BLACK);
//                int[] xs = figure.getX(yy);
//                int finalYy = yy;
//                Arrays.stream(xs).forEach(inti -> g.drawLine(inti, finalYy, inti, finalYy));
//            }
        });
    }

    public static void main(String[] args) {

        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        final Main comp = new Main();
        comp.setPreferredSize(new Dimension(1024, 720));
        testFrame.getContentPane().add(comp, BorderLayout.CENTER);
        JPanel buttonsPanel = new JPanel();
        JButton newLineButton = new JButton("New Line");
        JButton clearButton = new JButton("Clear");
        buttonsPanel.add(newLineButton);
        buttonsPanel.add(clearButton);
        testFrame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        newLineButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int x1 = 100;
                int x2 = 100;
                int y1 = 100;
                int y2 = 100;
                Color randomColor = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
//                comp.addLine(x1, y1, x2, y2, randomColor);
            }
        });
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                comp.clearFigures();
            }
        });
        testFrame.pack();
        testFrame.setVisible(true);
    }
}