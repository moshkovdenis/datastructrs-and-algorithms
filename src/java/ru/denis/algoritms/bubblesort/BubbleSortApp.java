package ru.denis.algoritms.bubblesort;


import java.util.Random;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100_000;
        Random r = new Random();
        ArrayBub arr = new ArrayBub(maxSize);
        for (int i = 0; i < maxSize; i++) {
            int n = r.nextInt((maxSize - 1));
            arr.insert(n);
        }
        long temp1 = System.currentTimeMillis();
        System.out.println("===========");
        arr.bubbleSort();
        long temp2 = System.currentTimeMillis();
        System.out.println(temp2 - temp1);


    }
}
