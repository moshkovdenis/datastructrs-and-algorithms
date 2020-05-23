package ru.denis.datastructures.lists.queuelist;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }
    public boolean isEmty() {
        return theList.isEmty();
    }
    public void insert(int elem) {
        theList.insertLast(elem);
    }
    public int remove() {
        return theList.deleteFirst();
    }
    public void displayQueue() {
        System.out.print("Queue (front --> rear): ");
        theList.displayList();
    }
}
