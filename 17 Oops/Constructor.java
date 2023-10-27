public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Abhiraj Singh");
        System.out.println(s1.name);
        Student s2 = new Student(05);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}