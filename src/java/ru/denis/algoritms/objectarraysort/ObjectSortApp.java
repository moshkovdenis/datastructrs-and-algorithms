package ru.denis.algoritms.objectarraysort;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr = new ArrayInOb(maxSize);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 63);
        arr.insert("Adams", "Henry", 53);
        arr.insert("Vang", "Minh", 22);
        System.out.println("Before: ");
        arr.display();
        arr.insertionSort();
        System.out.println("After");
        arr.display();
    }
}
