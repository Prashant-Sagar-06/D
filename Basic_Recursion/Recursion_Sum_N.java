package Basic_Recursion;

public class Recursion_Sum_N {
    public static int func_Sum_N(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + func_Sum_N(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = func_Sum_N(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
