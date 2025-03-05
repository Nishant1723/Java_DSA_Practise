package DSA;

public class Inheritance {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.l + " " + b1.h + " " + b1.w);

        Box b2 = new Box(5);
        System.out.println(b2.l + " " + b2.h + " " + b2.w);

        BoxWeight bw1 = new BoxWeight();
        System.out.println(bw1.l);
        bw1.sound();
        bw1.access();

        BoxPrice bp = new BoxPrice();
        System.out.println(bp.weight);

        BoxPrice bp1 = new BoxPrice();
        System.out.println(bp1.l + " " + bp1.h + " " + bp1.w + " " + bp1.weight + " " + bp1.cost);
    }

}

class Box {
    double h;
    double l;
    double w;

    void sound() {
        System.out.println("heeeee");
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double l, double w, double h ) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
}

class BoxWeight extends  Box{
    double weight;

    @Override
    void sound() {
        super.sound();
        System.out.println("meee");
    }

    void access() {
        super.sound();
    }


    BoxWeight() {
        super();
        this.weight = -1;
    }
}

class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(double l, double w, double h, double cost) {
        super();
        this.cost = -1;
    }
}
