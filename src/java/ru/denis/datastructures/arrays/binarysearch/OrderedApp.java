package ru.denis.datastructures.arrays.binarysearch;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

        arr.insert(22);
        arr.insert(55);
        arr.insert(44);
        arr.insert(66);
        arr.insert(77);
        arr.insert(33);
        arr.insert(88);
        arr.insert(99);

        int searchKey = 55;
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Cant find " + searchKey);
        }

        arr.display();

        arr.delete(55);
        arr.delete(66);
        arr.delete(77);

        arr.display();

    }
}
