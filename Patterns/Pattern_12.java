package Patterns;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n = sc.nextInt();
        sc.close();
        int space = 2*(n-1);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
}
