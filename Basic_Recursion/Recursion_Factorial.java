package Basic_Recursion;

public class Recursion_Factorial {
    public static int func_Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = n * func_Factorial(n - 1);
        return factorial;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = func_Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
