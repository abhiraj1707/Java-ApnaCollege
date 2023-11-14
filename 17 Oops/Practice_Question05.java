/*
 What will be the output of this code?(both classes in the same package)
*/
public class Practice_Question05 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();//Function Overriding
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
    void print() {
        System.out.println("Derived class(car)");
    }
}