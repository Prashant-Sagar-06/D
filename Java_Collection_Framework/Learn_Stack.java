package Java_Collection_Framework;

import java.util.*;

public class Learn_Stack {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();
        // Push
        stk.push("Mango");
        stk.push("Apple");
        stk.push("Banana");
        stk.push("Grapes");
        stk.push("Orange");
        stk.push("Pineapple");
        stk.push("Watermelon");
        System.out.println("Stack of fruits: " + stk);
        // Pop
        System.out.println("Popped element: " + stk.pop());
        System.out.println("Stack of fruits: " + stk);
        // Peek
        System.out.println("Top element: " + stk.peek());
        // Search
        System.out.println("Index of 'Banana': " + stk.search("Banana"));
        // Empty
        System.out.println("Is the stack empty? " + stk.empty());
        // Size
        System.out.println("Size of the stack: " + stk.size());
        // Clear
        stk.clear();
        System.out.println("Stack of fruits: " + stk);
    }
}