package DSA;

public class RunTimePolymorphism {
    public static void main(String[] args) {
    Animal myAnimal = new Dog();
    myAnimal.sound();
    myAnimal = new Cat();
    myAnimal.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Different animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog bhaw bhaw");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meow meow");
    }
}
