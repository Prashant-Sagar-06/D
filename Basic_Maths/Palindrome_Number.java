package Basic_Maths;
import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter numbers : ");
        int N = sc.nextInt();
        int temp = N;
        int reversed = 0;
        sc.close();
        while (N != 0) {
            res = N % 10;
            reversed = reversed * 10 + res;
            N /= 10;
        }
        System.out.println(reversed);
        if (temp == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }   

    }
}
