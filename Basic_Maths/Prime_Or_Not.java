package Basic_Maths;

import java.util.Scanner;

public class Prime_Or_Not {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        sc.close();
        if (isPrime(N)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
            
        }
    }
}
