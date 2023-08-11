import java.util.Scanner;

public class Prime_Number {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean prime =  isPrime(n);

        if(prime) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
