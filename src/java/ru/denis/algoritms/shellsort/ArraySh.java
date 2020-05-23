package ru.denis.algoritms.shellsort;

public class ArraySh {
    private int[] theArray;
    private int nElems;

    public ArraySh(int max) {
        theArray = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        theArray[nElems] = value;
        nElems++;
    }
    public void display() {
        System.out.print("A = ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }
    public void shellSort() {
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= nElems / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
