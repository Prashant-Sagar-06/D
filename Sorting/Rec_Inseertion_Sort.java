package Sorting;

import java.util.Scanner;

public class Rec_Inseertion_Sort {
    public static void RecInSort(int [] arr,int i, int n){
        if (i==n) {
            return;
        }
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            RecInSort(arr, i + 1, n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        RecInSort(arr,0,n);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close(); 
    }
}