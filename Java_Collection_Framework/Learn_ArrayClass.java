package Java_Collection_Framework;
import java.util.Arrays;

public class Learn_ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        // Copying array
        System.arraycopy(arr, 0, arr2, 0, 3);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sorting array
        Arrays.sort(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Searching array
        System.out.println(Arrays.binarySearch(arr2, 7));
        //Fill
        Arrays.fill(arr2, 7);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
