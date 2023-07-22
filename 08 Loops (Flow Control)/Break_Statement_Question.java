//Keep entering the numbers till user enters a multiple of 10
import java.util.*;

public class Break_Statement_Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0)
                break;
        }
        while (true);
    }
}
