public class Multi_level_Inheritance {
    public static void main(String[] arga) {
        Dog d1 = new Dog();
        d1.eat();
        d1.legs = 4;
        System.out.println(d1.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breadth() {
        System.out.println("breadths");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String bread;
}