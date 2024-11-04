package Basic_Recursion;

public class Recursion_1ToN {
    public static void func_1_N(int n) {
        if (n == 0) {
            return;
        }
        func_1_N(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        func_1_N(n);
    }
}
