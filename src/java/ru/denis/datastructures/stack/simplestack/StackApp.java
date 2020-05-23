package ru.denis.datastructures.stack.simplestack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(2);
        theStack.push(43);
        theStack.push(54);
        theStack.push(6);
        theStack.push(56);
        theStack.push(56);
        theStack.push(80);

        while (!theStack.isEmty()) {
            int value = theStack.pop();
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }
}
