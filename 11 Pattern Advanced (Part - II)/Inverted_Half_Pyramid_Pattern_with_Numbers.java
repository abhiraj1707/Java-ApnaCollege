/*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
 
                */

public class Inverted_Half_Pyramid_Pattern_with_Numbers {
    public static void inverterd_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //inner - numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverterd_half_pyramid_withNumbers(5);
    }
}
