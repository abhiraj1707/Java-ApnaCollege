import java.util.*;
public class Arrays_as_Function_Argument {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 15;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;        
        }
    }
    public static void main(String args[]) {
        int marks[] = {81, 87, 75};
        int nonChangable = 10;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        //print marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
