package ru.denis.datastructures.stack.simplestack;

public class StackX {
    private int[] stackArray;
    private int top;

    public StackX(int maxSize) {
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int elem) {
        stackArray[++top] = elem;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackArray.length -1);
    }
}
