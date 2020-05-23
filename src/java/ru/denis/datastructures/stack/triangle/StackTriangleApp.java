package ru.denis.datastructures.stack.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackTriangleApp {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle = " + theAnswer);
    }
    public static void stackTriangle()
    {
        theStack = new StackX(10000);
        theAnswer = 0;
        while (theNumber > 0) {
            theStack.push(theNumber);
            --theNumber;
        }
        while (!theStack.isEmty()) {
            int newN = theStack.pop();
            theAnswer += newN;
        }
    }
    public static int getInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        return num;
    }
}
