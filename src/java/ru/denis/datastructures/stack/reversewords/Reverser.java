package ru.denis.datastructures.stack.reversewords;

public class Reverser {
    private String input;

    public Reverser(String input) {
        this.input = input;
    }

    public String doReverse() {
        StackX theStack = new StackX(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        String output = "";
        while (!theStack.isEmty()) {
            char ch = theStack.pop();
            output += ch;
        }
        return output;
    }
}
