public class String_Function_Compare {
    public static void main(String args[]) {
        String s1 = "Abhiraj";
        String s2 = "Abhiraj";
        String s3 = new String("Abhiraj");
    
        if(s1.equals(s3)) {
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}
