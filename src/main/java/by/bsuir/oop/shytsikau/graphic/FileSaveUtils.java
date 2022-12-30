package by.bsuir.oop.shytsikau.graphic;

import by.bsuir.oop.shytsikau.graphic.figures.collections.FigureList;

import java.io.*;

public class FileSaveUtils {

    public static final String FILENAME = "figures_saved.bin";

    public static void save(FigureList figureList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("saved");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            figureList.writeExternal(objectOutputStream);

            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void load(FigureList figureList) {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            FigureList figures = new FigureList();
            figures.readExternal(objectInputStream);

            figureList.clear();
            figureList.addAll(figures);

            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
