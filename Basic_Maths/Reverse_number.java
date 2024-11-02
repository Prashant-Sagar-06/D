package Basic_Maths;
import java.util.Scanner;

public class Reverse_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter numbers : ");
        int N = sc.nextInt();
        sc.close();
        while (N!=0) {
            res=N%10;
            N/=10;
            System.out.print(res);
        }
    }
}