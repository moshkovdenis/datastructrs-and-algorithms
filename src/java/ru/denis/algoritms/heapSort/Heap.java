package ru.denis.algoritms.heapSort;

public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }
    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }
    public void displayHeap() {
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int index = 0;
        String dots = "........................";
        System.out.println(dots + dots);

        while (currentSize > 0) {
            if (column == 0) {
                for (int i = 0; i < nBlanks; i++) {
                    System.out.print(" ");
                }
            }
            System.out.print(heapArray[index].getKey());
            if (++index == currentSize) {
                break;
            }
            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else {
                for (int i = 0; i < nBlanks * 2 - 2; i++) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("\n" + dots + dots);
    }
    public void displayArray() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(heapArray[i].getKey() + " ");
        }
        System.out.println();
    }
    public void insertAt(int index, Node newNode) {
        heapArray[index] = newNode;
    }
    public void incrementSize() {
        currentSize++;
    }
}
