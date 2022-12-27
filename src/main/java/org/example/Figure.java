package org.example;

public interface Figure {
    default String name() {
        return "default";
    }
    int[] getY(int x);
    int[] getX(int y);
}
