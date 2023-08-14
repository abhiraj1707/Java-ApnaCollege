// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int i;
        int sumOdd= 0;
        int sumEven= 0;

        do {
            System.out.print("Enter the number : ");
            num = sc.nextInt();

            if( num % 2 == 0) {
                sumEven += num;
            }
            else {
                sumOdd += num;
            }
           
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
            i = sc.nextInt();
        }  
        
        while (i == 1);
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}
