package ru.denis.algoritms.quicksort_2;

public class QuickSort2App {
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
