package Patterns;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Upper half of the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i + 1; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i + 1; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
