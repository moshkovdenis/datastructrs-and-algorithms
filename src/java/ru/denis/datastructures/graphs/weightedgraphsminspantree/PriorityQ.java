package ru.denis.datastructures.graphs.weightedgraphsminspantree;

public class PriorityQ {
    private final int SIZE = 20;
    private Edge[] queArray;
    private int size;

    public PriorityQ() {
        queArray = new Edge[SIZE];
        size = 0;
    }

    public void insert(Edge item) {
        int index;
        for (index = 0; index < size; index++) {
            if (item.distance >= queArray[index].distance) {
                break;
            }
        }
        for (int k = size -1; k >= index; k--) {
            queArray[k + 1] = queArray[k];
        }
        queArray[index] = item;
        size++;
    }
    public Edge removeMin() {
        return queArray[--size];
    }
    public void removeN (int elem) {
        for (int i = elem; i < size - 1; i++) {
            queArray[i] = queArray[i + 1];
        }
        size--;
    }
    public Edge peekMin() {
        return queArray[size - 1];
    }
    public int size () {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public Edge peekN(int elem) {
        return queArray[elem];
    }
    public int find(int findDex) {
        for (int i = 0; i < size; i++) {
            if (queArray[i].destVert == findDex) {
                return i;
            }
        }
        return -1;
    }
}
