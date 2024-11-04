package Basic_Recursion;

public class Recursion_Name {
    public static void funcName(int N){
        if (N == 0) {
            return;
        }
        System.out.println("Hello Sagar!");
        funcName(N-1);
    }
    public static void main(String[] args) {
        funcName(5);
    }
}
