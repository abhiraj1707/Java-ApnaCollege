//Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.Scanner;

public class Question_1 {
    public static void main(String args[]) {
        int count = 0;
        System.out.print("Enter a line : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' /*||
             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'*/) {
                count++;
            }
        }
        System.out.println("Number of vowel is : " + count);
    } 
}
