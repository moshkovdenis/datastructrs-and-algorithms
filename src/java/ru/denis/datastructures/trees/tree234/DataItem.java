package ru.denis.datastructures.trees.tree234;

public class DataItem {
    public int dData;

    public DataItem(int dData) {
        this.dData = dData;
    }
    public void displayItem() {
        System.out.print("/" + dData);
    }
}
