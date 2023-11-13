/*
Which variable(s) can the class Person access in the folklowing code?
    a. name
    b. weight 
    c. rollNumber
    d. schoolName

    Ans = a & b
*/
public class Practice_Question02 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Abhiraj Singh";
        System.out.println(s.name);
        s.schoolName = "MPS";
        System.out.println(s.schoolName);
    }
    
}

class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}