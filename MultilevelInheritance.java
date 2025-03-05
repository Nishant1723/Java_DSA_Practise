package DSA;

public class MultilevelInheritance {
   public static void main(String[] args) {
        AA aa = new AA(5);
        System.out.println(aa.a);
        aa.aa();
        BB bb = new BB();
        System.out.println(bb.a);
        bb.aa();

    }
}

class AA {
    int a;
    int b;

    public AA(int side) {
        this.a = side;
        this.b = side;
    }
    AA() {
        this.a = -1;
    }

    public void aa() {
        System.out.println("this is a");
    }

}

class BB extends AA {
    BB() {
        super();
    }
}
class CC extends AA {
    CC(int side) {
        super(side);
    }
}
class DD extends AA {
    DD() {
        super();
    }
}
