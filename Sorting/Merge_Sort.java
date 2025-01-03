package Sorting;
import java.util.Scanner;
public class Merge_Sort {

    public static void Sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        Sort(arr, low, mid);    
        Sort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
    private static void Merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Sort(arr, 0, n-1);
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}