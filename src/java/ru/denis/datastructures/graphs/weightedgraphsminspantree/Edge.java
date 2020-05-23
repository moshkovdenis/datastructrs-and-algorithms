package ru.denis.datastructures.graphs.weightedgraphsminspantree;

public class Edge {
    public int srcVert;
    public int destVert;
    public int distance;

    public Edge(int srcVert, int destVert, int distance) {
        this.srcVert = srcVert;
        this.destVert = destVert;
        this.distance = distance;
    }
}
