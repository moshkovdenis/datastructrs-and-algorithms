package ru.denis.algoritms.insertsort;


import java.util.Random;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100_0000;
        ArrayIns arr = new ArrayIns(maxSize);
        Random r = new Random();
        for (int i = 0; i < maxSize; i++) {
            int n = r.nextInt((maxSize - 1));
            arr.insert(n);
        }
        long temp1 = System.currentTimeMillis();
        arr.insertionSort();
        long temp2 = System.currentTimeMillis();
        System.out.println(temp2 - temp1);
    }
}
