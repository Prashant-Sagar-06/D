package Java_Collection_Framework;

import java.util.*;

public class Learn_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // Add
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Watermelon");
        list.add("Papaya");
        list.add("Guava");
        list.add("Kiwi");
        System.out.println("List of fruits: " + list);
        list.add(2, "Sugarcane");
        System.out.println("Added element 'Sugarcane' at index 2");
        System.out.println("List of fruits: " + list);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Strawberry");
        list2.add("Blueberry");
        list2.add("Raspberry");
        list2.add("Blackberry");
        list.addAll(list2);
        System.out.println("List of fruits: " + list);
        // Size
        System.out.println("Size of the list: " + list.size());
        // Get
        System.out.println("Element at index 3: " + list.get(3));
        // Index of
        System.out.println("Index of Banana: " + list.indexOf("Mango"));
        // Remove
        list.remove("Papaya");
        System.out.println("Removed element 'Papaya'");
        list.remove(String.valueOf("Kiwi"));
        // Set
        list.set(4, "Pineapple");
        System.out.println("Set element 'Pineapple' at index 4");
        System.out.println("List of fruits: " + list);
        
        // Contains
        System.out.println("List contains 'Apple': " + list.contains("Apple"));

        // Is Empty
        System.out.println("Is the list empty? " + list.isEmpty());
        
        // SubList
        List<String> subList = list.subList(2, 5);
        System.out.println("SubList from index 2 to 5: " + subList);
        
        /*  To Array
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));*/

        //Traversal
        System.out.println("Traversing the list: ");
        //1. Using Iterator
        for (String fruit : list) {
            System.out.println("Using For each" +" " + fruit);
        }
        System.out.println();
        //2. Using For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Using For loop" +" "+ list.get(i));
        }
        System.out.println();
        //3. Using Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Using Iterator" +" " + itr.next());
        }
        System.out.println();
        //4. Using ListIterator
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println("Using ListIterator" +" " + listItr.next());
        }
        
        // Clear
        list.clear();
        System.out.println("List of fruits: " + list);
    }
}