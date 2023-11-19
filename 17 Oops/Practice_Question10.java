/*
What would be the output of the following code?
    Ans = 40
*/

class Test {
    static int a = 10;
    static int b;
    void changeB() {
        b = a * 3;
    }
}

public class Practice_Question10 {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.print(Test.a+Test.b);
    }    
}
