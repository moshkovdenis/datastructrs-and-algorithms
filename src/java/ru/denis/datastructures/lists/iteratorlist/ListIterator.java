package ru.denis.datastructures.lists.iteratorlist;

public class ListIterator {
    private Link current;
    private Link previous;
    private LinkList ourList;

    public ListIterator(LinkList list) {
        ourList = list;
        reset();
    }
    public void reset() {
        current = ourList.getFist();
        previous = null;
    }
    public boolean atEnd() {
        return current.next == null;
    }
    public void nextLink() {
        previous = current;
        current = current.next;
    }
    public Link getCurrent() {
        return current;
    }
    public void insertAfter(int key) {
        Link newLink = new Link(key);
        if (ourList.isEmty()) {
            ourList.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }
    public void insertBefore(int key) {
        Link newLink = new Link(key);
        if (previous == null) {
            newLink.next = ourList.getFist();
            ourList.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }
    public int deleteCurrent() {
        int value = current.dData;
        if (previous == null) {
            ourList.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
