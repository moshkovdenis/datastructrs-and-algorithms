package ru.denis.algoritms.quicksort;


public class QuickSortApp {
    public static void main(String[] args) {
        int maxSize = 100000;
        ArrayIns arr = new ArrayIns(maxSize);
        for (int i = 0; i <  maxSize; i++) {
            arr.insert((int) (Math.random()* 100000));
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
