package ru.denis.datastructures.arrays.binarysearch;

public class OrdArray {
    private int[] arr;
    private int nElems;

    public OrdArray(int max) {
        arr = new int[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if(arr[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (arr[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(int value) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index] > value) {
                break;
            }
        }
        for (int j = nElems; j > index; j--) {
            arr[j] = arr[j - 1];
        }
        arr[index] = value;
        nElems++;
    }

    public boolean delete(int value) {
        int index = find(value);
        if (index == nElems) {
            return false;
        } else {
            for (int j = index; j < nElems; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
