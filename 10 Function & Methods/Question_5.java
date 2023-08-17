//Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class Question_5 {
    public static int getSum(int n) {
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int digits = sc.nextInt();
        System.out.println("Sum : " + getSum(digits));
    }
}
