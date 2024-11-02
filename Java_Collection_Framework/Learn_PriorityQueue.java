package Java_Collection_Framework;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Learn_PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //ADD
        queue.offer("Mango");
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Pineapple");
        queue.offer("Grapes");
        queue.offer("Orange");
        System.out.println("Elements in the queue: " + queue);
        //REMOVE
        System.out.println(queue.poll());
        System.out.println("Elements in the queue: " + queue);
        //DISPLAY
        System.out.println(queue.peek());
    }
}
