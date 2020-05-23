package ru.denis.datastructures.arrays.dataarray;

public class DataArray {
    private Person[] arr;
    private int nElems;

    public DataArray(int max) {
        arr = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index].getLastName().equals(searchName)) {
                break;
            }
        }
        if (index == nElems) {
            return null;
        } else {
            return arr[index];
        }
    }

    public void insert(String last, String first, int age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index].getLastName().equals(searchName)) {
                break;
            }
        }
        if (index == nElems) {
            return false;
        } else {
            for (int j = index; j < nElems; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            return true;
        }
    }

    public void displayA() {
        for(int i = 0; i < nElems; i++) {
            arr[i].displayPerson();
        }
    }
}
