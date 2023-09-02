import java.util.*;
public class Largest_in_array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest< numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {5, 7, 11, 15, 6, 7, 21, 4};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
