/*
Find out the correct statement to assign name to object
    a. s->name = "Abhiraj Singh"
    b. Student.name = "Abhiraj Singh"
    c. s.name = "Abhiraj Singh"
*/

public class Practice_Question01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Abhiraj Singh";
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int marks;
}

