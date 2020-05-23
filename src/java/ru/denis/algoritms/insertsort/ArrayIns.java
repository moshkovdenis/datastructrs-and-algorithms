package ru.denis.algoritms.insertsort;

public class ArrayIns {
    private int[] arr;
    private int nElems;

    public ArrayIns(int max) {
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

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
}
