package ru.denis.algoritms.quicksort_3;

public class QuickSort3App {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns arr = new ArrayIns(maxSize);
        for (int i = 0; i < maxSize; i++) {
            arr.insert((int) (Math.random()* 99));
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
