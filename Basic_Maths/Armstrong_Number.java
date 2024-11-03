package Basic_Maths;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        sc.close();
        
        int temp = N;
        int numDigits = String.valueOf(N).length();
        int sum = 0;
        
        while (N > 0) {
            int rem = N % 10;
            N /= 10;
            sum += Math.pow(rem, numDigits);
        }
        
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
