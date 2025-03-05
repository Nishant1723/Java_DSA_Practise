package DSA;

public class AbstractClass {
    public static void main(String[] args) {

        Son son = new Son();
        son.career();


        Daughter daughter = new Daughter();
        daughter.partner();

    }
}

abstract class Parent {

    abstract void career();
    abstract void partner();
}

class Son extends Parent {
    @Override
    void career() {
        System.out.println("Going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("Loves pets");
    }
}


class Daughter extends Parent {
    @Override
    void career() {
        System.out.println("Going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("Loves pets");
    }
}
