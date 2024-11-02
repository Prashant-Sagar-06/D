package Basic_Maths;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int N = sc.nextInt();
        sc.close();
        while (N>0) {
            count++;
            N/=10;
        }
        System.out.println(count);
    }
}
