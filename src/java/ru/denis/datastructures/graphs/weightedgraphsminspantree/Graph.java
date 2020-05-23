package ru.denis.datastructures.graphs.weightedgraphsminspantree;

public class Graph {
    private final  int MAX_VERTS = 20;
    private final int INFINITY = 1000000;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private int currentVert;
    private PriorityQ thePQ;
    private int nTree;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = INFINITY;
            }
        }
        thePQ = new PriorityQ();
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }
    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
        adjMat[end][start] = weight;
    }
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }
    public void minSpanTree() {
        currentVert = 0;
        while (nTree < nVerts -1) {
            vertexList[currentVert].isInTree = true;
            nTree++;
            for (int i = 0; i < nVerts; i++) {
                if (i == currentVert) {
                    continue;
                }
                if (vertexList[i].isInTree) {
                    continue;
                }
                int distance = adjMat[currentVert][i];
                if (distance == INFINITY) {
                    continue;
                }
                putInPQ(i, distance);
            }
            if (thePQ.size() == 0) {
                System.out.println(" GRAPH NOT CONNECTED");
                return;
            }
            Edge theEdge = thePQ.removeMin();
            int sourceVert = theEdge.srcVert;
            currentVert = theEdge.destVert;

            System.out.print(vertexList[sourceVert].label);
            System.out.print(vertexList[currentVert].label);
            System.out.print(" ");
        }
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].isInTree = false;
        }
    }
    public void putInPQ(int newVert, int newDist) {
        int queueIndex = thePQ.find(newDist);
        if (queueIndex != -1) {
            Edge tempEdge = thePQ.peekN(queueIndex);
            int oldDist = tempEdge.distance;
            if (oldDist > newDist) {
                thePQ.removeN(queueIndex);
                Edge theEdge = new Edge(currentVert, newVert, newDist);
                thePQ.insert(theEdge);
            }

        } else {
            Edge theEdge = new Edge(currentVert, newVert, newDist);
            thePQ.insert(theEdge);
        }
    }
}
