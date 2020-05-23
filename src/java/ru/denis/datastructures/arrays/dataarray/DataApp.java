package ru.denis.datastructures.arrays.dataarray;

public class DataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 63);
        arr.insert("Adams", "Henry", 53);
        arr.insert("Vang", "Minh", 22);

        arr.displayA();

        String searchKeyFirst = "Smith";
        findPerson(arr, searchKeyFirst);
        String searchKeySecond = "Allan";
        findPerson(arr, searchKeySecond);

        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Adams");

        arr.displayA();
    }

    private static void findPerson(DataArray arr, String searchKey) {
        Person found;
        found = arr.find(searchKey);
        if (found != null) {
            System.out.print("Found: ");
            found.displayPerson();
        } else {
            System.out.println("Cant find " + searchKey);
        }
    }

}
