//Write a program to print the multiplication table of a number N, entered by the user.
import java.util.*;
public class Question_4 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
        System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
