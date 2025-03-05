package DSA;

public class HybridInheritance {
    public static void main(String[] args) {
    C intCla = new C();
    intCla.showA();
    intCla.showB();
    intCla.showC();
    intCla.showD();
    }
}

class A {
    void showA() {
        System.out.println("class A");
    }
}

interface B {
    default void showB() {
        System.out.println("interface B");
    }
}

interface D {
    void showD();
}

class C extends A implements B,D {

    public void showD() {
        System.out.println("interface D");
    }
    public void showC() {
        System.out.println("class C");
    }
}
