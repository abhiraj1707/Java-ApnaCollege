public class If_Else {
    public static void main(String args[])   {  
        int age = 25;
        if(age >= 18) {
            System.out.println("Adult : Drive, Vote");
        }

        else if(age > 13 && age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not adult");
        }
    }
}