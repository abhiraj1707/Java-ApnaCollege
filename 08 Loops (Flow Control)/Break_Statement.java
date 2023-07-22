import java.util.*;
public class Break_Statement {
    public static void main(String args[]) {
        for (int i = 1; i <= 15; i++) {
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
    }
}
