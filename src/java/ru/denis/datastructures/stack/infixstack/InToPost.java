package ru.denis.datastructures.stack.infixstack;

public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String input) {
        this.input = input;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }
    public  String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char elem = input.charAt(i);
            theStack.displayStack("For  " + elem + " ");
            switch (elem) {
                case '+':
                case '-':
                    gotOper(elem, 1);
                    break;
                case '*':
                case '/':
                    gotOper(elem, 2);
                    break;
                case '(':
                    theStack.push(elem);
                    break;
                case ')':
                    gotParen(elem);
                    break;
                default:
                    output += elem;
                    break;
            }

        }
        while (!theStack.isEmty()) {
            theStack.displayStack("While ");
            output += theStack.pop();
        }
        theStack.displayStack("End  ");
        return output;
    }
    public void gotOper(char opThis, int precl) {
        while (!theStack.isEmty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < precl) {
                    theStack.push(opTop);
                    break;
                } else {
                    output += opTop;
                }
            }
            theStack.push(opThis);
        }
    }
    public void gotParen(char c) {
        while (!theStack.isEmty()) {
             c = theStack.pop();
            if(c == '(') {
                break;
            } else {
                output += c;
            }
        }
    }
}
