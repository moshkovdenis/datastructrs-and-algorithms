package ru.denis.algoritms.objectarraysort;

public class ArrayInOb {
    private Person[] arr;
    private int nElemns;

    public ArrayInOb(int max) {
        arr = new Person[max];
        nElemns = 0;
    }

    protected void insert(String last, String first, int age) {
        arr[nElemns] = new Person(last, first, age);
        nElemns++;
    }

    protected void display() {
        for (int i = 0; i < nElemns; i++) {
           arr[i].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < nElemns; out++) {
            Person temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
}
