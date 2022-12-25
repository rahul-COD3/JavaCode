package Opps_Programming.Inharitance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// derived Dog class
class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }

}

// derived Cat class
class Cat extends Animal {

    void meow() {
        System.out.println("Meowing...");
    }

}

// derived Cow class
class Cow extends Animal {

    void moo() {
        System.out.println("Mooing...");
    }

}

// driver class
public class Inheritance {
    public static void main(String args[]) {

        Dog tuffy = new Dog();
        Cat anna = new Cat();
        Cow molly = new Cow();
        tuffy.bark();
        tuffy.eat();
        anna.meow();
        anna.eat();
        molly.moo();
        molly.eat();

    }
}