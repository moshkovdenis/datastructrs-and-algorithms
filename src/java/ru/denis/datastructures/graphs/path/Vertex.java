package ru.denis.datastructures.graphs.path;

public class Vertex {
    public char label;
    public boolean isInTree;

    public Vertex(char label) {
        this.label = label;
        isInTree = false;
    }
}
