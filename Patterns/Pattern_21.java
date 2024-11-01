package Patterns;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i==0 || i==rows-1) {
                    System.out.print("*");
                } else if (j==0 || j==rows-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}
