package ru.denis.datastructures.stack.bracketstack;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        StackX theStack = new StackX(input.length());

        for (int i = 0; i < input.length(); i++) {
            char elem = input.charAt(i);
            switch (elem) {
                case '{':
                case '[':
                case '(':
                    theStack.push(elem);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmty()) {
                        char check = theStack.pop();
                        if((elem == '}' && check != '{') || (elem == ']' && check != '[')
                                || (elem == ')' && check != '(') ) {
                            System.out.println("Error: " + elem + " at " + i);
                        }
                    } else System.out.println("Error: " + elem + " at " + i);
                    break;
                default:
                    break;
            }
        }
        if ( (!theStack.isEmty())) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
