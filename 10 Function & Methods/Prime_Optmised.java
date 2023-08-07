import java.util.Scanner;

public class Prime_Optmised {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
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
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Non-Prime Number");
        }
    }
}
