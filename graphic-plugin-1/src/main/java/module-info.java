import by.bsuir.oop.shytsikau.graphic.api.plugins.FigureTransformer;
import by.bsuir.oop.shytsikau.graphic.plugin1.RotateTransformer;
import by.bsuir.oop.shytsikau.graphic.plugin1.SizeTransformer;

// Java module Service Provider Interface
module graphic_plugin_rotate {
    requires graphic_api;
    requires java.desktop;
    provides FigureTransformer with
            RotateTransformer,
            SizeTransformer;
}