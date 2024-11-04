package Basic_Recursion;

public class Recursion_N_To_1 {
    public static void func_N_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        func_N_1(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        func_N_1(n);
    }
}
