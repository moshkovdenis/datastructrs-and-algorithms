package ru.denis.datastructures.arrays.simplearray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int i;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(3, 22);
        arr.setElem(4, 88);
        arr.setElem(5, 11);
        arr.setElem(6, 00);
        arr.setElem(7, 66);
        arr.setElem(8, 33);
        arr.setElem(9, 45);
        nElems = 10;
        for (i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println();
        int searchKey = 232;
        for (i = 0; i <nElems; i++) {
            if (arr.getElem(i) == searchKey) {
                break;
            }
        }
        System.out.println("i: " + i);
        if (i == nElems) {
            System.out.println("Cant find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }
        for (i = 0; i < nElems; i++) {
            if (arr.getElem(i) == 55) {
                break;
            }
        }
        for (int k = i; k < nElems; k++) {
            arr.setElem(k , arr.getElem(k + 1));
        }
        nElems--;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println();



    }
}
