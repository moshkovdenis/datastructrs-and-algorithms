package ru.denis.algoritms.bubblesort;

public class ArrayBub {
    private int[] arr;
    private int nElems;

    public ArrayBub(int max) {
        arr = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if(arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
