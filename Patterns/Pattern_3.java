package Patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void NumberPat(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        NumberPat(n);
        sc.close();
    }
}
