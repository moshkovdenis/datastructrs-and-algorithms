package ru.denis.datastructures.stack.infixstack;


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
        return stackArray[top--];
    }
    public char peek() {
        return stackArray[top];
    }
    public boolean isEmty() {
        return (top == -1);
    }
    public int size() {
        return top + 1;
    }
    public char peekN(int elem) {
        return stackArray[elem];
    }
    public void displayStack(String str) {
        System.out.print(str + " Stack (bottom -->top): ");
        for (int i = 0; i <size(); i++ ) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println();
    }
}
