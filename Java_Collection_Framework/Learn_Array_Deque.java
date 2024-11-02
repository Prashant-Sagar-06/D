package Java_Collection_Framework;

import java.util.Deque;
import java.util.ArrayDeque;

public class Learn_Array_Deque {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        // Add elements
        queue.add("B");
        queue.offer("C");
        queue.offerFirst("D");
        queue.offerLast("A");
        System.out.println("Elements in the queue: " + queue);
        //Remove
        System.out.println(queue.peek());
        System.out.println("Elements in the queue: " + queue);
        System.out.println(queue.peekFirst());
        System.out.println("Elements in the queue: " + queue);
        System.out.println(queue.peekLast());
        System.out.println("Elements in the queue: " + queue);
        //Display
        queue.poll();
        System.out.println("Elements in the queue: " + queue);
        queue.pollFirst();
        System.out.println("Elements in the queue: " + queue);
        queue.pollLast();
        System.out.println("Elements in the queue: " + queue);
    }
}
