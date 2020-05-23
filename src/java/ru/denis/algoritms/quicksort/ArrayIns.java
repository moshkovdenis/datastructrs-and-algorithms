package ru.denis.algoritms.quicksort;

public class ArrayIns {
    private int[] theArray;
    private int nElems;

    public ArrayIns(int max) {
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
    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }
    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = theArray[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition -1);
            recQuickSort(partition + 1, right);
        }
    }
    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (theArray[++leftPtr] < pivot);
            while (rightPtr > 0 && theArray[--rightPtr] > pivot);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }
    public void swap(int left, int right) {
        int temp = theArray[left];
        theArray[left] = theArray[right];
        theArray[right] = temp;
    }
}
