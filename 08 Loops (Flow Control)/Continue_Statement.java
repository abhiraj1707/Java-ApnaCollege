import java.util.*;

public class Continue_Statement {
    public static void main ( String args[]) {
        for ( int i = 1; i <= 15; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
