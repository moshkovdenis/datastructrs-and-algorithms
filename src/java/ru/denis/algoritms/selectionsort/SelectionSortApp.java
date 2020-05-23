package ru.denis.algoritms.selectionsort;

import java.util.Random;

public class SelectionSortApp {
    public static void main(String[] args) {
        int maxSize = 100_000;
        Random r = new Random();
        ArraySel arr = new ArraySel(maxSize);
        for (int i = 0; i < maxSize; i++) {
            int n = r.nextInt((maxSize - 1));
            arr.insert(n);
        }
        long temp1 = System.currentTimeMillis();
        arr.selectionSort();
        long temp2 = System.currentTimeMillis();
        System.out.println(temp2 - temp1);
    }
}
