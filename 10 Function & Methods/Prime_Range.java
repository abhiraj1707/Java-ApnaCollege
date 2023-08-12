import java.util.Scanner;
public class Prime_Range {
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= n/2 ; i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter the first number : ");  
        int f = s.nextInt();  
        System.out.print("Enter the second number : ");  
        int l = s.nextInt();  
        System.out.println("Prime numbers between " + f + " and " + l );  
        for (int i = f; i <= l; i++) {  
            if (isPrime(i)) {  
                System.out.print( i+ " ");  
            }  
        }  
    }
}
