package DSA;

public class OOP {
    public static void main(String[] args) {
        Human spec1 = new Human(21,"Nishant",45000,false);
        Human spec2 = new Human(22,"Sarthak",55000,false);
        spec2.dispaly();
        System.out.println(spec1.name);
        System.out.println(spec1.salary);
        System.out.println(spec1.married);
        System.out.println(Human.population);
    }
}

class Human {
    final int SPEED = 100;
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    void dispaly() {
//        SPEED = 10;
        System.out.println(SPEED);
    }

    Human(int age,String name,int salary,boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1 ;
    }

}
