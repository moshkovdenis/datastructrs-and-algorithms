package ru.denis.algoritms.mergesort_2;

public class DArray {
    private int [] theArray;
    private int nElems;

    public DArray(int max) {
        theArray = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        int[] workSpace = new int[nElems];
        recMergeSort(workSpace, 0 , nElems -1);
    }

    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int index = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int elem = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (theArray[lowPtr] < theArray[highPtr]) {
                workSpace[index++] = theArray[lowPtr++];
            } else {
                workSpace[index++] = theArray[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workSpace[index++] = theArray[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workSpace[index++] = theArray[highPtr++];
        }
        for(index = 0; index < elem; index++) {
            theArray[lowerBound + index] = workSpace[index];
        }
    }
}
