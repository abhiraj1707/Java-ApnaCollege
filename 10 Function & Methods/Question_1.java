//Write a Java method to compute the average of three numbers.

import java.util.Scanner;
public class Question_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number : ");
        float a = sc.nextFloat();
        System.out.print("Second number : ");
        float b = sc.nextFloat();
        System.out.print("Third number : ");
        float c = sc.nextFloat();
        System.out.print("The average is : " + average(a, b, c));
    }

    public static float average(float a, float b, float c) {
        return(a + b + c) / 3;
    }
}
