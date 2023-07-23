//Display all numbers entered by user except multiples of 10.

import java.util.*;

public class Question_Continue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        }
        while(true);
    }
}
