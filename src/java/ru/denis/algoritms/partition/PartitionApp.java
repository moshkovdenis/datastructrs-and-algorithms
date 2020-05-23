package ru.denis.algoritms.partition;

public class PartitionApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayPar arr = new ArrayPar(maxSize);
        for (int i = 0; i < maxSize; i ++) {
            int num = (int) (Math.random() * 199);
            arr.insert(num);
        }
        arr.display();
        int pivot = 45;
        System.out.print("Pivot is " + pivot);
        int size = arr.size();
        int parDex = arr.partitionIt(0, size - 1,pivot);
        System.out.println(", Partition is at index " + parDex);
        arr.display();
    }
}
