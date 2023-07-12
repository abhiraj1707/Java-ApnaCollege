import java.util.*;
public class Positive_Or_Negative {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        x = sc.nextInt();
            if (x > 0) {
                System.out.println("is greater than 0");
            } 
            else {
                System.out.println("is less than or equal 0");
            }
    }
}
