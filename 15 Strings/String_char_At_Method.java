public class String_char_At_Method {
    public static void printLetters(String str) {
        
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String firstName = "Abhiraj";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        
        printLetters(fullName);
    } 
}
