package ru.denis.algoritms.quicksort_3;

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
        recQuickSort(0 , nElems -1);
    }
    public void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size < 10) {
            insertionSort(left, right);
        } else {
            int median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }
    private int medianOf3(int left, int right) {
        int center = (left + right) / 2;
        if (theArray[left] > theArray[center]) {
            swap(left, center);
        }
        if (theArray[left] > theArray[right]) {
            swap(left, right);
        }
        if (theArray[center] > theArray[right]) {
            swap(center, right);
        }
        swap(center, right - 1);
        return theArray[right - 1];
    }
    private void swap(int num1, int num2) {
        int temp = theArray[num1];
        theArray[num1] = theArray[num2];
        theArray[num2] = temp;
    }
    private int partitionIt(int left, int right, int pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;
        while (true) {
            while (theArray[++leftPtr] < pivot);
            while (theArray[--rightPtr] > pivot);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }
    private void insertionSort(int left, int right) {
        int in, out;
        for (out = left + 1; out <= right; out++) {
            int temp = theArray[out];
            in = out;
            while (in > left && theArray[in - 1] >= temp) {
                theArray[in] = theArray[in - 1];
                --in;
            }
            theArray[in] = temp;
        }
    }
}
