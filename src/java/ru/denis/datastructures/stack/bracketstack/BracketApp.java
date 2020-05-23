package ru.denis.datastructures.stack.bracketstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            BracketChecker theChacker = new BracketChecker(input);
            theChacker.check();
        }
    }

    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        return result;
    }
}
