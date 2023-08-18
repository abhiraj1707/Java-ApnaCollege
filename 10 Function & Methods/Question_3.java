//Write a Java program to check if a number is a palindrome or not.

import java.util.Scanner;
public class Question_3 {
    public static boolean isPalindrome(int n) {
        int ans = 0;
        int reverse = n;
        while(n != 0)  {
            int lastDigit = n % 10;
            ans = ans * 10 + lastDigit;
            n = n / 10;
        }
        if(ans == reverse) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String arga[]) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isPalindrome(a)) {
            System.out.println(a + " is a palindrome");
        }
        else {
            System.out.println(a + " is not a palindrome");
        }
    }
}