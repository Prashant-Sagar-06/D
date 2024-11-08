package Hashing;
import java.util.Scanner;

public class Min_Max_freq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();   
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int [] hash = new int[100]; 
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        sc.close();

        int maxFreq = Max(hash);
        int minFreq = Min(hash);

        int maxElement = -1;
        int minElement = -1;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == maxFreq) {
                maxElement = i;
            }
            if (hash[i] == minFreq) {
                minElement = i;
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with minimum frequency: " + minElement + " (Frequency: " + minFreq + ")");
    }

    public static int Max(int[] hash) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
            }
        }
        return max;
    }

    public static int Min(int[] hash) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0 && hash[i] < min) {
                min = hash[i];
            }
        }
        return min;
    }
}