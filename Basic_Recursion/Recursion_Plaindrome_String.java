package Basic_Recursion;

public class Recursion_Plaindrome_String {
    public static boolean func_Palindrome_String(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return func_Palindrome_String(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String str = "madam";
        if(func_Palindrome_String(str, 0, str.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
