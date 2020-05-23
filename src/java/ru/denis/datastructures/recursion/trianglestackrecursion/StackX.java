package ru.denis.datastructures.recursion.trianglestackrecursion;

public class StackX {
    private Params[] stackArray;
    private int top;

    public StackX(int maxSize) {
        stackArray = new Params[maxSize];
        top = -1;
    }

    public void push(Params elem) {
        stackArray[++top] = elem;
    }
    public  Params pop() {
        return stackArray[top--];
    }
    public Params peek() {
        return stackArray[top];
    }
}
