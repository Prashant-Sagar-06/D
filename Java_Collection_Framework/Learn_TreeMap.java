package Java_Collection_Framework;

import java.util.Map;

public class Learn_TreeMap {

    public static void main(String[] args) {
        Map<Integer, String> mp = new java.util.TreeMap<>();
        //Add
        mp.put(1, "One");
        mp.put(2, "Two");
        mp.put(3, "Three");
        mp.put(4, "Four");
        mp.put(5, "Five");
        System.out.println("Elements of HASHMAP : " + mp);
        //Replace
        mp.replace(1, "One", "ONE");
        System.out.println("Elements of HASHMAP(AFTER REPLACE 1) : " + mp);
        //containsValue
        System.out.println("Is ONE present in HASHMAP : " + mp.containsValue("ONE"));
        //ContainsKey
        System.out.println("Is 2 present in HASHMAP : " + mp.containsKey(2));
        //Remove
        mp.remove(4);
        System.out.println("Elements of HASHMAP(AFTER REMOVE 4 ) : " + mp);
        //Contains
        System.out.println("Is 3 present in HASHMAP : " + mp.containsKey(3));
        //Size
        System.out.println("Size of HASHMAP : " + mp.size());
        //Clear
        mp.clear();
        System.out.println("Elements of HASHMAP(AFTER CLEAR) : " + mp);
        //IsEmpty
        System.out.println("Is HASHMAP empty : " + mp.isEmpty());
        //PutAll
        Map<Integer, String> mp1 = new java.util.HashMap<>();
        mp1.put(6, "Six");
        mp1.put(7, "Seven");
        mp1.put(8, "Eight");
        mp1.put(9, "Nine");
        mp1.put(10, "Ten");
        mp.putAll(mp1);
        System.out.println("Elements of HASHMAP(AFTER PUTALL) : " + mp);
        //Equals
        Map<Integer, String> mp2 = new java.util.HashMap<>();
        mp2.put(6, "Six");
        mp2.put(7, "Seven");
        mp2.put(8, "Eight");
        mp2.put(9, "Nine");
        mp2.put(10, "Ten");
        System.out.println("Is mp and mp2 equal : " + mp.equals(mp2));
        //HashCode
        System.out.println("Hashcode of mp : " + mp.hashCode());
        //Iteration
        for (Integer key : mp1.keySet()) {
            System.out.println("Key : " + key + " Value : " + mp1.get(key));
        }
        //RemoveAll
        for (Integer key : mp1.keySet()) {
            mp.remove(key);
        }
        System.out.println("Elements of HASHMAP(AFTER REMOVEALL) : " + mp);

    }
}