package Basic_Maths;

import java.util.Scanner;

public class All_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        sc.close();
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                arr[i] = i;
            }

        }
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
