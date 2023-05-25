
class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    
    public void run() {
        System.out.println(super.name + " is running.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println(super.name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();  // Inherited from Animal
        dog.run();  // Inherited from Mammal
        dog.bark(); // Defined in Dog class
    }
}
