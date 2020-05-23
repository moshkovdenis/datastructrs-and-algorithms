package ru.denis.algoritms.partition;

public class ArrayPar {
    private int[] array;
    private int nElems;

    public ArrayPar(int max) {
        array = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }
    public int size() {
        return nElems;
    }
    public void display() {
        System.out.print("A = ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rigthPtr = right + 1;
        while (true) {
            while (leftPtr < right && array[++leftPtr] < pivot) ;
            while (rigthPtr > left && array[--rigthPtr] > pivot) ;
            if (leftPtr >= rigthPtr) {
                break;
            } else {
                int temp = array[leftPtr];
                array[leftPtr] = array[rigthPtr];
                array[rigthPtr] = temp;
            }
        }
        return leftPtr;
    }
}
