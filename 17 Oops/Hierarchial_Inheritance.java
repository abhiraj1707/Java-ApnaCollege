public class Hierarchial_Inheritance {
    public static void main(String[] arga) {
        Fish shark = new Fish();
        System.out.print("Fish : ");
        shark.swim();
        shark.eat();
        shark.breadth();

        System.out.println();
        Mammal Dog = new Mammal();
        System.out.print("Dog : ");
        Dog.walk();
        Dog.eat();
        Dog.breadth();

        System.out.println();
        Bird Crow = new Bird();
        System.out.print("Crow : ");
        Crow.Fly();
        Crow.eat();
        shark.breadth();
    }
}
class Animal {
    String color;

    void eat() {
        System.out.print(" eats ");
    }

    void breadth() {
        System.out.print(" breadths");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.print("walk");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.print("swim");
    }
}
class Bird extends Animal {
    void Fly() {
        System.out.print("fly");
    }
}