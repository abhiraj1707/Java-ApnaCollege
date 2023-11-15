/*
 What will be the output of this code?(both classes in the same package)
*/
public class Practice_Question06 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(vehicle)");
    }
}
class Car extends Vehicle {
    void print1() {
        System.out.println("Derived class(car)");
    }
}

/*
OUTPUT :
    Practice_Question06.java:7: error: cannot find symbol
        obj1.print1();
            ^
  symbol:   method print1()
  location: variable obj1 of type Vehicle
  1 error
*/