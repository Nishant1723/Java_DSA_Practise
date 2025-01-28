package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems_Sorting {
    public static void main(String[] args) {
        //1. MISSING NUMBER
//        int[] arr = {0,1,2,5,3};
//        System.out.println(missingNumber(arr));

        //2. MISSING ALL NUMBER
//        int[] arr = {0,1,2,5,3};
//        missingALLNumber(arr);
//        System.out.println(Arrays.toString(arr));

//        3.Finding duplicate
//        int[] arr = {1,2,3,3,4};
//        System.out.println(duplicateNumber(arr));

//      4.Finding all Missing

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = duplicateAllNumber(arr);
        System.out.println(duplicates);

    }
    //1. MISSING NUMBER
//    public static int missingNumber(int[] arr) {
//        int i = 0;
//        while(i<arr.length) {
//            int correct = arr[i];
//            if(arr[i] < arr.length && arr[i] != arr[correct]){
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
    //    search for missing element

//        for(int index = 0; index < arr.length; index++) {
//            if(arr[index] != index) {
//                return index;
//            }
//        }
//        return arr.length;
//    }
//    static  void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    //2. MISSING ALL NUMBER

//     static List<Integer> missingALLNumber(int[] arr) {
//         int i = 0;
//         while(i < arr.length) {
//             int correctIndex = arr[i] - 1;
//             if(arr[i] != arr[correctIndex]) {
//                 swap(arr, i , correctIndex);
//             } else {
//                 i++;
//             }
//        }
//        List<Integer> ans = new ArrayList<>();
//        for(int index=0; index<arr.length; index++) {
//            if(arr[index] != index + 1) {
//                ans.add(index + 1);
//            }
//        }
//        return ans;
//
//    }
//        static  void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }


    //        3.Finding duplicate

//    public static int duplicateNumber(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            if (arr[i] != i+1) {
//                int correct = arr[i] - 1;
//                if(arr[i] != arr[correct]) {
//                    swap(arr, i, correct);
//                } else {
//                    return arr[i];
//                }
//            } else {
//                i++;
//            }
//        }
//        return -1;
//    }
//    static  void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    //      4.Finding all Missing
    static List<Integer> duplicateAllNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++) {
            if(arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static  void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
