public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        System.out.print("Fish : ");
        shark.eat();
        shark.breadth();
        shark.swim();
    }
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.print("eats,");
    }

    void breadth() {
        System.out.print("breadths,");
    }
}

//Derived Class / sub class
class Fish extends Animal {
    void swim() {
        System.out.print("Swims in water.");
    }
}