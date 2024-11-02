package Java_Collection_Framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Learn_Collection_Class {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 5, 5,5,58, 20));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 5));
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list, 5));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        Collections.fill(list, 0);
        System.out.println(list);

    }
}
