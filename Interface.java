package DSA;

public class Interface {
    public static void main(String[] args) {
    Dom_animal myGoat =  new Goat();
        myGoat.sound();

    Goat mygoat = new Goat();
    mygoat.call_cowSound();

    }
}

interface Dom_animal {
    void sound(); //abstract method

}
interface Cow {
    default void sound() {
        System.out.println("cow hmmmmm....");
    }
}
class Goat implements Dom_animal, Cow {
    public void sound() {
        System.out.println("goat baaa...");

    }

        void call_cowSound() {
            Cow.super.sound();
        }
}

