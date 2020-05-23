package ru.denis.datastructures.hashtables.hashchain;

public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTable(int arraySize) {
        this.arraySize = arraySize;
        hashArray = new SortedList[arraySize];
        for (int i = 0; i < arraySize; i++) {
            hashArray[i] = new SortedList();
        }
    }
    public void displayTable() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + ". ");
            hashArray[i].displayList();
        }
    }
    public int hashFunc(int key) {
        return key % arraySize;
    }
    public void insert(Link theLink) {
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }
    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }
    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
