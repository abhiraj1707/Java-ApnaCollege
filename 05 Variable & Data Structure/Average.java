//Input 3 numbers and print the average of these 3 numbers.
import java.lang.*;
import java.util.*;

class Average {
    public static void main(String args[])  {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int average = (a + b + c) / 3;
         System.out.println("average is : " + average);
    }
}
