package ru.denis.datastructures.lists.sortedlist;

public class Link {
    public int dData;
    public Link next;

    public Link(int dData) {
        this.dData = dData;
    }
    public void displayLink(){
        System.out.print(dData + " ");
    }
}
