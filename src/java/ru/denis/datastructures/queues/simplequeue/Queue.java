package ru.denis.datastructures.queues.simplequeue;

public class Queue {
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int elem) {
        if (rear == queArray.length - 1) {
            rear = -1;
        }
        queArray[++rear] = elem;
        nItems++;
    }

    public int remove() {
        int temp = queArray[front++];
        if(front == queArray.length) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == queArray.length);
    }

    public int size() {
        return nItems;
    }
}
