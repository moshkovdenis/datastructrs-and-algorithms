package ru.denis.datastructures.arrays.simplearray_2;


public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(66);
        arr.insert(55);
        arr.insert(44);
        arr.insert(33);
        arr.insert(22);
        arr.insert(88);
        arr.insert(99);

        arr.display();

        int searchKey = 88;
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Cant found " + searchKey);
        }
        arr.delete(33);
        arr.delete(22);
        arr.delete(77);

        arr.display();
    }
}
