package ru.denis.datastructures.graphs.weightedgraphsminspantree;

public class Vertex {
    public char label;
    public boolean isInTree;

    public Vertex(char label) {
        this.label = label;
        isInTree = false;
    }
}
