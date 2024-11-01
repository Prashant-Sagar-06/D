package Patterns;
import java.util.Scanner;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scn.nextInt();
        scn.close();
        int ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
    }
}
