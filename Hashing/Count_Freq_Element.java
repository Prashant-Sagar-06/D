package Hashing;
import java.util.Scanner;
public class Count_Freq_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();   
        System.out.println("Enter elements of array : ");
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int [] hash = new int[max + 1]; 
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        System.out.println("Enter number to find frequency : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Frequency of " + num + " is : " + hash[num]);
        System.out.println("Element frequencies:");

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] != 0) {
                System.out.println(arr[i] + " : " + hash[arr[i]]);
                hash[arr[i]] = 0; 
            }
        }
    }
}