package ru.denis.datastructures.recursion.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }
    public static int triangle(int num) {
        System.out.println("Entering: num = " + num);
        if (num == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = num + triangle(num - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        return str;
    }
    public static int getInt() throws IOException {
        String str = getString();
        return Integer.parseInt(str);
    }
}
