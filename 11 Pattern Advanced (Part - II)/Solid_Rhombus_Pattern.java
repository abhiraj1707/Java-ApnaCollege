/*
          
          ******
         ******
        ******
       ******
      ******
     ******
                    */

public class Solid_Rhombus_Pattern {
    public static void solid_rohmbus(int n) {
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //Star
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        solid_rohmbus(6);
    }
}
