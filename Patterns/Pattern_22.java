package Patterns;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        int size = 2 * rows - 1; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                int value = rows - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
    }
}
