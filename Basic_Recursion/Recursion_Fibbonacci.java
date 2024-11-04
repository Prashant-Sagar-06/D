package Basic_Recursion;

public class Recursion_Fibbonacci {
    public static int func_Fibbonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return func_Fibbonacci(n-1) + func_Fibbonacci(n-2);
    }
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for(int i=0; i<n; i++){
            sum = func_Fibbonacci(i);
        }
        System.out.println(sum);
    }
}
