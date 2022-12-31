import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Ellipse;
import by.bsuir.oop.shytsikau.graphic.figures.basic.LineSegment;
import by.bsuir.oop.shytsikau.graphic.figures.composite.IsoscelesTriangle;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Parallelogram;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Rectangle;

// Java module Service Provider Interface
module graphic {
    requires java.desktop;
    requires graphic_api;
    exports by.bsuir.oop.shytsikau.graphic.figures;
    uses FigureTransformer;
    uses Figure;
    provides Figure with
            LineSegment,
            Rectangle,
            Ellipse,
            IsoscelesTriangle,
            Parallelogram;
}