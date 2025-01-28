package DSA;

public class Recursion_Problem {
    public static void main(String[] args) {
//        FIBBO
//        int ans = fibboFromula(50);
//        System.out.println(ans);

        for (int i = 0; i < 11; i++) {
            System.out.println(fibboFromula(i));
        }

//        RECURSION USING BINARY SEARCH

//        int[] arr = {0,2,6,4,9,44,66};
//        int target = 44;
//        System.out.println(search(arr, target, 0, arr.length - 1));


    }

//    FIBBO


    static int fibboFromula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

static int fibbo(int n) {
    if (n < 2) {
        return n;
    }

    return fibbo(n - 1) + fibbo(n - 2);
    }


    //        RECURSION USING BINARY SEARCH

//    static int search(int[] arr, int target, int s, int e) {
//        if(s > e) {
//            return -1;
//        }
//        int m = s + (e - s) / 2;
//
//        if(arr[m] == target) {
//            return m;
//        }
//        if(target < arr[m]) {
//            return search(arr, target, s,  m- 1);
//        }
//        return search(arr, target, m + 1, e);
//    }
}
