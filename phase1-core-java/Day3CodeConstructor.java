class Animal {
    String name;

    // default constructor
    Animal() {
        this.name = "Unknown";
        System.out.println("Animal created");
    }

    // parameterized constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {

    String breed;

    Dog(String name, String breed) {
        super(name);  // calls Animal constructor
        this.breed = breed;
    }

    void display() {
        System.out.println(name + " " + breed);
    }
}

public class Day3CodeConstructor{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Cat");
        Dog d1 = new Dog("Bruno", "Labrador");
        d1.display();
    }
}