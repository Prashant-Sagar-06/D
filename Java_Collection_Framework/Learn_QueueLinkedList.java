package Java_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class Learn_QueueLinkedList {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.offer("F");
        queue.offer("G");
        queue.offer("H");

        // Display elements
        System.out.println("Elements in the queue: " + queue);

        // Remove elements
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Elements in the queue: " + queue);

        // Display the first element
        System.out.println("First element: " + queue.element());

        // Remove elements
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Elements in the queue: " + queue);

        // Display the first element
        System.out.println("First element: " + queue.peek());
    }
}