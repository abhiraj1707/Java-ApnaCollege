import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int f = 1; // To hold factorial

        for(int i=1; i<=n; i++) {
           f = f * i;
        }

        return f; //factorial of n;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int n = sc.nextInt();
        int fact =  factorial(n);
        System.out.println("The factorial of given value is : "+ fact);
    }
}
