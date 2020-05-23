package ru.denis.datastructures.lists.stacklist;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }
    public void insertFirst(int elem) {
        Link newLink = new Link(elem);
        newLink.next = first;
        first = newLink;
    }
    public boolean isEmty() {
        return first == null;
    }
    public int deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp.dData;
    }
    public void displayList(){
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
