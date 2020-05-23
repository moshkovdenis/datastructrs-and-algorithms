package ru.denis.datastructures.queues.priorityqueue;

public class PriorityQ {
    private int[] queArray;
    private int nItems;

    public PriorityQ(int maxSize) {
        queArray = new int[maxSize];
        nItems = 0;
    }

    public void insert(int item) {
        int index;
        if(nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (index = nItems -1; index >= 0; index--) {
                if (item > queArray[index]){
                    queArray[index + 1] = queArray[index];
                } else {
                    break;
                }
            }
            queArray[index +1] = item;
            nItems++;
        }
    }

    public int remove() {
        return queArray[--nItems];
    }

    public int peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == queArray.length);
    }
}
