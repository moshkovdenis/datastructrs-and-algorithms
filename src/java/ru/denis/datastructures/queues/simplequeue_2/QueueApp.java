package ru.denis.datastructures.queues.simplequeue_2;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while (!queue.isEmty()) {
            int temp = queue.remove();
            System.out.print(temp + " ");
        }
        System.out.println("");
    }
}


