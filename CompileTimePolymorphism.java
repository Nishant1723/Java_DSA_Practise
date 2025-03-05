package DSA;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2,3));
        System.out.println(math.add(2,3,3));
        System.out.println(math.add(2.3,3.4));


    }
}
class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

}

