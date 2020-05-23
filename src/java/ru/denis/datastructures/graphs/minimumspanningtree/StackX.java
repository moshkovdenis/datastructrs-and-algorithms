package ru.denis.datastructures.graphs.minimumspanningtree;

public class StackX {
    private final int SIZE = 20;
    private int[] arr;
    private int top;

    public StackX() {
        arr = new int[SIZE];
        top = -1;
    }

    public void push(int elem) {
        arr[++top] = elem;
    }
    public int pop() {
        return arr[top--];
    }
    public int peek() {
        return arr[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
