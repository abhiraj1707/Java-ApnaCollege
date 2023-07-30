import java.util.Scanner;

public class Sum {
    public static int calculateSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum of a and b is : "+ sum);
    }
}
