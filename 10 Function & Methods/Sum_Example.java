import java.util.Scanner;

public class Sum_Example {
    //function to calculate sum of two numbers.
    public static int sum(int a, int b) {
        return a + b;
    }

    //function to calculate sum of three numbers.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();               
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.println("Sum of a and b is : "+ sum(a, b));
        System.out.println("Sum of a, b and c is : " + sum(a, b, c));
    }
}
