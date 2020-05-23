package ru.denis.datastructures.lists.insertionsortlist;

public class SortedList {
    private Link first;
    public SortedList() {
        first = null;
    }
    public SortedList(Link[] linkArr) {
        first = null;
        for (int i = 0; i < linkArr.length; i++) {
            insert(linkArr[i]);
        }
    }
    public void insert(Link elem) {
        Link previous = null;
        Link current = first;

        while (current != null && elem.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        if(previous == null) {
            first = elem;
        } else {
            previous.next = elem;
        }
        elem.next = current;
    }
    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}
