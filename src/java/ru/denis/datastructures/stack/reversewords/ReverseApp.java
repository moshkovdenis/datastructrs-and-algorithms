package ru.denis.datastructures.stack.reversewords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            Reverser theReverser = new Reverser(input);
            output = theReverser.doReverse();
            System.out.println("Reverser: " + output);
        }
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        return result;
    }
}
