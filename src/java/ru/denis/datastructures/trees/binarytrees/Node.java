package ru.denis.datastructures.trees.binarytrees;

public class Node {
    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.println("{" + iData + ", " + dData + "}");
    }
}
