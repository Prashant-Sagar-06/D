package Sorting;
import java.util.Scanner;
public class Merge_Sort {
    public static class InnerMergeSort {
        public void mergesort(int [] arr, int low, int high){
            if(low>=high){
                return;
            }
            int left = low;
            int right = high;
            int mid = (low+high)/2;
            mergesort(arr, low, mid);
            while (left <= mid && mid+1 <= right) {
                if(arr[left] < arr[mid+1]){
                    left++;
                }else{
                    int temp = arr[mid+1];
                    for (int i = mid; i >= left; i--) {
                        arr[i+1] = arr[i];
                    }
                    arr[left] = temp;
                    left++;
                    mid++;
                }
            }

            mergesort(arr, mid+1, high);
            while (mid+1 <= right && right+1 <= high) {
                if(arr[mid+1] < arr[right+1]){
                    right++;
                }else{
                    int temp = arr[right+1];
                    for (int i = right; i >= mid+1; i--) {
                        arr[i+1] = arr[i];
                    }
                    arr[mid+1] = temp;
                    right++;
                    mid++;
                }
                
            }
                merge(arr, low, mid, high);
            }
    
            private void merge(int[] arr, int low, int mid, int high) {
                int n1 = mid - low + 1;
                int n2 = high - mid;
    
                int[] left = new int[n1];
                int[] right = new int[n2];
    
                for (int i = 0; i < n1; ++i)
                    left[i] = arr[low + i];
                for (int j = 0; j < n2; ++j)
                    right[j] = arr[mid + 1 + j];
    
                int i = 0, j = 0;
                int k = low;
                while (i < n1 && j < n2) {
                    if (left[i] <= right[j]) {
                        arr[k] = left[i];
                        i++;
                    } else {
                        arr[k] = right[j];
                        j++;
                    }
                    k++;
                }
    
                while (i < n1) {
                    arr[k] = left[i];
                    i++;
                    k++;
                }
    
                while (j < n2) {
                    arr[k] = right[j];
                    j++;
                    k++;
                }
            }
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
            InnerMergeSort obj = new InnerMergeSort();
            obj.mergesort(arr, 0, n-1);
            System.out.println("Array after sorting: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }

