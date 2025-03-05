package DSA;

public class JavaPractise {
    public static void main(String[] args) {
//        System.out.println("Swaping using third variable");
        int a = 5;
        int b = 6;
        System.out.println("a : " + a + " " + "b : " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " " + "b : " + b);


//   Swaping without using third variable
//        System.out.println("Swaping without using third variable");
        int c = 5;
        int d = 10;
        System.out.println("c : " + c + " " + "d : " + d);

        c = c + d; // c = 15
        d = c - d; // d = 5
        c = c - d;

        System.out.println("c : " + c + " " + "d : " + d);


        //  Verify num is even or add
//        System.out.println("Verify num is even or add");
        int num = 12;
        if(num % 2 == 0) {
            System.out.println(num + " num is even");
        } else {
            System.out.println(num + " num is odd");
        }


        //  Verify year is leap year or not leap year
//        System.out.println("Verify year is leap year or not leap year");
        int year = 2025;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " year is leap year");
        } else {
            System.out.println(year + " year is not leap year");
        }


        //  Verify num is zero,  positive or negative
//        System.out.println(" Verify num is zero,  positive or negative");

        int num1 = 10;
        if(num1 > 0) {
            System.out.println(num1 + " num is positive");
        } else if(num1 < 0) {
            System.out.println(num1 + " num is negative");
        } else {
            System.out.println(num1 + " num is zero");
        }


        //  Finding the largest number amonng three number
//        System.out.println(" Finding the largest number amonng three number");

        int n1 = 15;
        int n2= 26;
        int n3 = 9;

        if(n1>n2 && n1>n3) {
            System.out.println(" n1 is bigger");
        } else if (n2 > n1 && n2> n3 ) {
            System.out.println(" n2 is bigger");
        } else {
            System.out.println(" n3 is bigger");
        }

//        Finding the sum from 1 to 10

        int result = 0;
        for(int i=1; i<=10; i++) {
            result += i;
        }

        System.out.println(result);


//        Fibbonacci series
        int n = 10;
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);

        for(int i = 2; i<n; i++) {
            int next = first + second;
            System.out.print("," +
                    "" + next);
            first = second;
            second = next;
        }
    }

}
