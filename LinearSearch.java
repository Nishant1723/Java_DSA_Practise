package DSA;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {


        //    FINDING THE WHICH USER HAS MAX MONEY IN ACCOUNT
//
//        int [][] accounts = {
//                {1,2,3},
//                {3,2,1},
//        };
//
//        System.out.println(maxiumWealth(accounts));




        //  FIND NUMBERS WITH EVEN NUMBERS OF DIGITS

//       int [] nums = {12,345,2,6,7896};
//        System.out.println(findNumber(nums));


//        SEARCHING THE INT IN THE ARRAY

//        int [] num = {1, 5, 22, 36, 45, 95, -88, -11, 3 };
//    int target = 1;
//    int ans = linearSearch(num , target);
//        System.out.println(ans);

//        SEARCHING FOR THE CHAR AT STRING
//
//        String name = "Nishant";
//        char target = 'm';
//        System.out.println(search(name , target));

        //    SEARCHING THE ELEMENT IN THE ARRAY WITH SPECIFIC RANGE

//    int [] arr = {1,35,85,9,63};
//    int target = 9;
//        System.out.println(specRange(arr, target, 1,3));

//        MIN VAL INT THE ARRAY

//        int [] arr = {1,-2,85,9,63};
//        System.out.println(minVal(arr));


        //    SEARCHING THE ELEMENT IN THE 2D ARRAY

//        int [][] arr = {
//                {1,2,5,4},
//                {5,9,3,66,74},
//                {77,7},
//                {5,96,35,48,12,75}
//        };
//
//        int target = 77;
//        int [] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));

        //    FINDING THE MAX VALUE IN THE 2D ARRAY

//        int [][] arr = {
//                {1,2,5,4},
//                {5,9,3,66,74},
//                {77,7},
//                {5,96,35,48,12,75}
//        };
//
//        System.out.println(Arrays.toString(MAX(arr)));



  }


//        SEARCHING THE INT ARRAY
    //Search in the array if element found return index
//    if item not found return -1

//    static int linearSearch(int[] arr, int target) {
//        if(arr.length == 0) {
//            return -1;
//        }
//        System.out.println(arr.length);

//        for(int index=0; index<arr.length; index++) {
//            int element = arr[index];
//            if(element == target){
//                return  element;
//            }
//        }

//        for(int num : arr) {
////            int element = arr[index];
//            if(num == target){
//                return  num;
//            }
//        }

//        return -1;


//        SEARCHING FOR THE CHAR AT STRING

//    static  boolean search(String str, char traget) {
//        if(str.length() == 0) {
//            return false;
//        }
//
//        for(int i=0; i<str.length(); i++) {
//            if(traget == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }


//    SEARCHING THE ELEMENT IN THE ARRAY WITH SPECIFIC RANGE

//    static  int specRange(int arr[], int target, int start, int end) {
//        if(arr.length == 0) {
//            return  -1;
//        }
//
//        for(int i = start; i<=end; i++){
//            int el = arr[i];
//            if(el == target) {
//                return 1;
//            }
//        }
//        return -1;
//    }


    //        MIN VAL INT THE ARRAY

//    static int minVal(int arr[]) {
//        int ans = arr[0];
//        for(int i=1; i<arr.length; i++) {
//            if(arr[i] < ans) {
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }

//    SEARCHING THE ELEMENT IN THE 2D ARRAY

//    static int[] search(int [][] arr, int target) {
//        for(int r=0; r<arr.length; r++) {
//            for(int c=0; c<arr[r].length; c++) {
//                if(arr[r][c]==target) {
//                    return new int[] {r, c};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }



//    FINDING THE MAX VALUE IN THE 2D ARRAY

//    static int[] MAX(int [][] arr) {
//        int ans = Integer.MIN_VALUE;
//        for(int r=0; r<arr.length; r++) {
//            for(int c=0; c<arr[r].length; c++) {
//                if(arr[r][c]>ans) {
//                    ans = arr[r][c];
//                }
//            }
//        }
//        return new int[]{ans};
//    }



//  FIND NUMBERS WITH EVEN NUMBERS OF DIGITS

//    static  int findNumber(int[] nums) {
//        int count = 0;
//        for(int num : nums){
//            if(even(num)) {
//                count ++;
//            }
//        }
//        return count;
//    }
//    static boolean even(int num) {
//        int numberofDigits = digit(num);
//        if(numberofDigits % 2 ==0) {
//            return true;
//        }
//        return false;
//}
//
//
//static int digit(int num) {
//        if(num < 0) {
//            num = num * -1;
//        }
//
//        if(num == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (num > 0) {
//            count ++;
//            num = num/10;
//        }
//        return count;
//}

//    FINDING THE WHICH USER HAS MAX MONEY IN ACCOUNT

    public static int maxiumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts) {
            int sum = 0;
            for(int anInt : ints) {
                sum += anInt;
            }

            if(sum>ans) {
                ans = sum;
            }

        }
        return ans;
    }


}
