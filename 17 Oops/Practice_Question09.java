/*
Which line has error?
   Ans =  No Error
*/

class Test {
    static int marks;
    void set_marks(int marks) {
        this.marks = marks;     //Line 1
    }
}

public class Practice_Question09 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(85);        //Line 2
        System.out.println(Test.marks);     //Line 3
    }
}
