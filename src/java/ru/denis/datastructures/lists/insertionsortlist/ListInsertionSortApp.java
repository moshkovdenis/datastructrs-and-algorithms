package ru.denis.datastructures.lists.insertionsortlist;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;

        Link[] linkArray = new Link[size];
        for (int i = 0; i < size; i++) {
            int num = (int) (Math.random() * 99);
            Link newLink = new Link(num);
            linkArray[i] = newLink;
        }
        System.out.print("Unsorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].dData + " ");
        }
        System.out.println();

        SortedList theSortedList = new SortedList(linkArray);
        for (int i = 0; i < size; i++) {
            linkArray[i] = theSortedList.remove();
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].dData + " ");
        }
        System.out.println();
    }
}
