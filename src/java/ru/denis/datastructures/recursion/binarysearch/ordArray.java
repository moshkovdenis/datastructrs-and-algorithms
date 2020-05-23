package ru.denis.datastructures.recursion.binarysearch;

public class ordArray {
    private int[] arr;
    private int nElems;

    public ordArray(int max) {
        arr = new int[max];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }
    public int find(int searchKey) {
        return recFind(searchKey,0, nElems -1);
    }

    private int recFind(int searchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;
        if (arr[curIn] == searchKey) {
            return curIn;
        } else if (lowerBound > upperBound) {
            return nElems;
        } else {
            if (arr[curIn] < searchKey) {
                return recFind(searchKey, curIn + 1, upperBound);
            } else {
                return recFind(searchKey, lowerBound, curIn - 1);
            }
        }
    }
    public void insert(int value) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index] > value){
                break;
            }
        }
        for (int i = nElems; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        nElems++;
    }
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
