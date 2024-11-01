package Patterns;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        int ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }
    }
}
