package ru.denis.datastructures.hashtables.hashdouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashDoubleApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        DataItem aDataItem;
        int size, n;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        HashTable theHashTable = new HashTable(size);

        for (int i = 0; i < n; i++) {
            aKey = (int) (Math.random() * 2 * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aKey, aDataItem);
        }
        while (true) {
            System.out.print("Enter first letter of show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new  DataItem(aKey);
                    theHashTable.insert(aKey, aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    public static char getChar() throws IOException {
        return getString().charAt(0);
    }
    public static int getInt() throws IOException {
        return Integer.parseInt(getString());
    }
}
