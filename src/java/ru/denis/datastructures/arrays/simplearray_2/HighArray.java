package ru.denis.datastructures.arrays.simplearray_2;

import java.util.Arrays;

public class HighArray {
    private int[] arr;
    private int nElems;

    public HighArray(int max) {
        arr = new int[max];
        nElems = 0;
    }

    @Override
    public String toString() {
        return "HighArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public boolean find(int searchKey) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index] == searchKey) {
                break;
            }
        }
        if (index == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(int value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(int value) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (value == arr[index]) {
                break;
            }
        }
        if (index == nElems) {
            return false;
        } else {
            for ( int k = index; k < nElems; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
