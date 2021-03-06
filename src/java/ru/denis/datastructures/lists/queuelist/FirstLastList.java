package ru.denis.datastructures.lists.queuelist;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }
    public boolean isEmty() {
        return first == null;
    }
    public void insertLast(int elem) {
        Link newLink = new Link(elem);
        if(isEmty()){
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    public int deleteFirst() {
        int temp = first.dData;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
