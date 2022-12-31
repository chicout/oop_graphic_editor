package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.api.Figure;
import by.bsuir.oop.shytsikau.graphic.api.Point;
import by.bsuir.oop.shytsikau.graphic.api.collections.PointArray;
import by.bsuir.oop.shytsikau.graphic.api.collections.FigureList;
import by.bsuir.oop.shytsikau.graphic.api.composite.FigureSet;

/**
 *  Static parser for simple script language creating new user figure
 */
public class ScriptLanguageParser {

    /**
     * Creates new user figure based on provided script
     * @param figures list of figures to find a figure from
     * @param name name of newly created user figure
     * @param script script describing the creation
     * @return
     */
    public static Figure createFigure(FigureList figures, String name, String script) {
        // create user figure with name
        FigureSet figureSet = new FigureSet(name);

        String[] figureScripts = script.split(";\n");
        // traversing each line splited with semicolon and new line - each figure to add
        for (String figureScript : figureScripts){
            Figure newFigure = null;
            String[] token = figureScript.split(" ");
            // cloning new figure from desired original figure
            newFigure = figures.getFigure(token[0]).clone();

            // copying only commands for creating required dimensional properties for new figure
            String[] commands = new String[token.length -1];
            System.arraycopy(token, 1, commands, 0, token.length -1);

            // traversing commands
            // THEY ARE POLYMORPHIC - NO CASTING - each figure implementation can or not implement such property change
            for (String command : commands) {
                if (command.startsWith("points")) {
                    String[] paramsArr = extractParamsFromBrackets(command);
                    int i = 0;
                    PointArray points = new PointArray();
                    while (i < paramsArr.length) {
                        points.add(new Point(Integer.parseInt(paramsArr[i++]), Integer.parseInt(paramsArr[i++])));
                    }
                    newFigure.setPoints(points);
                } else if (command.startsWith("angle")) {
                    newFigure.setAngle(Double.parseDouble(extractParamsFromBrackets(command)[0]));
                } else if (command.startsWith("width")) {
                    newFigure.setWidth(Integer.parseInt(extractParamsFromBrackets(command)[0]));
                } else if (command.startsWith("height")) {
                    newFigure.setHeight(Integer.parseInt(extractParamsFromBrackets(command)[0]));
                } else if (command.startsWith("startpoint")) {
                    String[] paramsArr = extractParamsFromBrackets(command);
                    newFigure.setStartPoint(new Point(Integer.parseInt(paramsArr[0]), Integer.parseInt(paramsArr[1])));
                }
            }
            // add figure to user complex figure
            figureSet.addFigure(newFigure);
        }
        return figureSet;
    }

    private static String[] extractParamsFromBrackets(String command) {
        String params = command.substring(command.indexOf("(")+1, command.indexOf(")"));
        return params.split(",");
    }
}
