package DSA;

public class Problems_Math {
    public static void main(String[] args) {
//        FINDING ODD NUM\

//        int n = 68;
//        System.out.println(isOdd(n));


//        FINDING UNIQUE VALUE

        int[] arr = {2,3,5,3,6,2,5};
        System.out.println(ans(arr));


    }


    //        FINDING ODD NUM

//    private static boolean isOdd(int n) {
//        return (n & 1) == 1;
//    }


    //        FINDING UNIQUE VALUE

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }




}
