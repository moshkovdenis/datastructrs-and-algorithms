package ru.denis.algoritms.selectionsort;

public class ArraySel {
    private int[] arr;
    private int nElems;

    public ArraySel(int max) {
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

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }

    }

    private void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
