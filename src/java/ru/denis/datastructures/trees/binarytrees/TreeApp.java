package ru.denis.datastructures.trees.binarytrees;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        theTree.insert(50,1.5);
        theTree.insert(25,1.2);
        theTree.insert(75,1.7);
        theTree.insert(12,1.5);
        theTree.insert(37,1.2);
        theTree.insert(43,1.7);
        theTree.insert(30,1.5);
        theTree.insert(33,1.2);
        theTree.insert(87,1.7);
        theTree.insert(93,1.5);
        theTree.insert(97,1.5);

        while (true) {
            System.out.print("Enter first letter of show. insert, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value, value + 0.9);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found ");
                        found.displayNode();
                        System.out.print("\n");
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    if (theTree.delete(value)) {
                        System.out.println("Value is deleted");
                    } else {
                        System.out.println("value not found");
                    }
                    break;
                case 't':
                    value = getInt();
                    theTree.traverse(value);
                    break;
            }
        }
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        return str;
    }
    public static char getChar() throws IOException {
        return getString().charAt(0);
    }
    public static int getInt() throws IOException {
        return Integer.parseInt(getString());
    }
}
