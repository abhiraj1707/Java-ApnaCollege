public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s3 = new Student("Abhiraj Singh");
        System.out.println(s3.name);
        s1.roll = 221955;
        System.out.println(s1.roll);
        s1.password = "Raj";
        s1.marks[0] = 85;
        s1.marks[1] = 95;
        s1.marks[2] = 75;

        Student s2 = new Student(s1);
        s2.password = "Nihal";
        s2.marks[2] = 65;       
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called..");
    }
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
