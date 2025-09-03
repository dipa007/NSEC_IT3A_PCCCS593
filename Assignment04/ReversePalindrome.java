import java.util.*;
public class ReversePalindrome {
    static int reverse(int n){
        int r = 0;
        while(n!=0){ r = r*10 + n%10; n/=10; }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = reverse(n);
        System.out.println("Reverse: " + rev);
        System.out.println(n == rev ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
