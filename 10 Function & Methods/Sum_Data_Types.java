public class Sum_Data_Types {
    //function to calculate int sum.
    public static int sum(int a, int b) {
        return a + b;
    }

    //function to calculate float sum.
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("Sum of a and b is : " + sum(4, 5));
        System.out.println("Sum of a and b is : " + sum(6.4f, 7.5f));
    }
}
