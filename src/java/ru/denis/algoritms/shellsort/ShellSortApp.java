package ru.denis.algoritms.shellsort;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 100_000_000;
        ArraySh arr = new ArraySh(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int n = (int) (Math.random() * 100_000_000);
            arr.insert(n);
        }
        long temp1 = System.currentTimeMillis();
        arr.shellSort();
        long temp2 = System.currentTimeMillis();
        System.out.println(temp2 - temp1);
    }
}
