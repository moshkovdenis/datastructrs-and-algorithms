package ru.denis.datastructures.stack.reversewords;

public class StackX {
    private char[] stackArray;
    private int top;

    public StackX(int maxSize) {
    stackArray = new char[maxSize];
    top = -1;
    }

    public void push(char elem) {
        stackArray[++top] = elem;
    }

    public char pop() {
        return  stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmty() {
        return (top == -1);
    }
}
