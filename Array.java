package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    int[] arr = new int[5];
//    arr[0] = 5;
//    arr[1] = 7;
//    arr[2] = 10;
//    arr[3] = 6;
//    arr[4] = 2;
//        System.out.println(arr[3]);

//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i] + "");
//        }

//        For Each loop
//        for(int num : arr) {
//            System.out.print(num + " ");
//        }


//        ARRAYS IN STRING

//    String [] str = new String[5];
//        for(int i=0; i<str.length; i++) {
//            str[i] = sc.next();
//
//      }
//        System.out.println(Arrays.toString(str));
//
//        str[1] = "Nishant";
//        System.out.println(Arrays.toString(str));


//        array using function
//        int[] nums = {3,5,8,7,9};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static void change(int[] arr) {
//        arr[2] = 99;


//      2D ARRAY

//         Input
//        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }

//        Output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row=0; row<arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for(int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }

//         Array for undefined columns
//        int [][] arr = {
//                {1,2,3},
//                {1,2,3,4},
//                {1,2}
//        };
//        for(int row=0; row<arr.length; row++) {
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//         ARRAY USING USER INPUT

//        System.out.println("Enter the number of elements in the array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter " + n + " numbers:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("You entered the following numbers:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

//        2D ARRAY USING USER INPUT

//        System.out.println("Enter the number of row");
//        int a = sc.nextInt();
//        System.out.println("Enter the number of column");
//        int b = sc.nextInt();
//        int [][] arr1 = new int[a][b];
//        System.out.println("Enter " + a +" rows " + b + " columns");
//        for(int row=0; row<arr1.length; row++) {
//            for(int col=0; col<arr1[row].length; col++){
//                arr1[row][col] = sc.nextInt();
//            }
//        }
//
//        for(int[] num : arr1) {
//            System.out.println(Arrays.toString(num));
//        }


//        ARRAYLIST

//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(45);
//        list.add(15);
//        list.add(85);
//        list.add(62);
//        list.add(4);
//        list.add(56);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(15));
//        System.out.println(list.contains(22));
//
//        System.out.println(list.set(0,97));
//        System.out.println(list);
//
//        System.out.println(list.remove(4));
//        System.out.println(list);


//        for(int i=0; i<5; i++) {
//            list.add(sc.nextInt());
//        }
//
//        for(int i=0; i<5; i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();


//        MULTIDIMENSIONAL ARRAYLIST

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        INITIALIZATION
//        for(int i=0; i<3; i++) {
//            list.add(new ArrayList<>());
//        }
//        for(int i=0; i<3; i++) {
//            for(int j=0; j<3; j++) {
//                list.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list);


//        QUESTIONS
//        1.SWAP THE NUM

//        int[] arr = {4,5,6,3,7};
//        swap(arr, 1, 2);
//        System.out.println(Arrays.toString(arr));


//        2.FINDING THE MAX NUM IN THE ARRAY

//        int[] arr = {4,5,6,3,7};
//        System.out.println(Max(arr));
//
//     2.FINDING THE MAX NUM IN THE ARRAY WITHIN SPECIFIC RANGE
//
//        int[] arr = {4,5,6,3,7};
//        System.out.println(Max(arr, 1, 3));

//        3.REVERSING THE ARRAY
//
//        int[] arr = {4, 5, 6, 3, 7};
//        reverse(arr);
//        System.out.println(Arrays.toString((arr)));
    }



//      1.SWAP THE NUM

//    static void swap(int [] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

//    2.FINDING THE MAX NUM IN THE ARRAY

//    static int Max(int[] arr) {
//        int MaxVal = arr[0];
//        for(int i=1; i<arr.length; i++){
//            if(arr[i] > MaxVal) {
//                MaxVal = arr[i];
//            }
//        }
//        return MaxVal;

//     2.FINDING THE MAX NUM IN THE ARRAY WITHIN SPECIFIC RANGE
//        static int Max(int[] arr, int start, int end) {
//            int MaxVal = arr[start];
//            for(int i=start; i<end; i++){
//                if(arr[i] > MaxVal) {
//                    MaxVal = arr[i];
//                }
//            }
//            return MaxVal;
//

//    static void reverse(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end) {
//            swap(arr, start , end);
//            start++;
//            end--;
//        }
//    }
//    static void swap(int [] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }



}
