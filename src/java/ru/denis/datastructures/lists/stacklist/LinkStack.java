package ru.denis.datastructures.lists.stacklist;

public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }
    public void push(int elem) {
        theList.insertFirst(elem);
    }
    public int pop() {
        return theList.deleteFirst();
    }
    public boolean isEmty() {
        return theList.isEmty();
    }
    public void displayStack() {
        System.out.print("Stack (top --> bottom): ");
        theList.displayList();
    }
}
