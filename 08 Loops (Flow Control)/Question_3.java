//Write a program to find the factorial of any number entered by the user
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // To hold number 
        int fact = 1; // To hold factorial

        System.out.print("Enter a positive number : ");
        n  = sc.nextInt();

        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println("Factorial : "+ fact);
    }
}
