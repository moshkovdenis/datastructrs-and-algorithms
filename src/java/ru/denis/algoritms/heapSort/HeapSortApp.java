package ru.denis.algoritms.heapSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSortApp {
    public static void main(String[] args) throws IOException {
        int size, index;
        System.out.print("Enter number of items: ");
        size = getInt();
        Heap theHeap = new Heap(size);

        for (index = 0; index < size; index++) {
            int random = (int) (Math.random()* 100);
            Node newNode = new Node(random);
            theHeap.insertAt(index, newNode);
            theHeap.incrementSize();
        }
        System.out.print("Random: ");
        theHeap.displayArray();
        for (index = size / 2 - 1; index >= 0 ; index--) {
            theHeap.trickleDown(index);
        }
        System.out.print("Heap: ");
        theHeap.displayArray();
        theHeap.displayHeap();
        for (index = size - 1; index >= 0; index--) {
            Node biggestNode = theHeap.remove();
            theHeap.insertAt(index, biggestNode);
        }
        System.out.print("Sorted: ");
        theHeap.displayArray();
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    public static int getInt() throws IOException {
        return Integer.parseInt(getString());
    }
}
