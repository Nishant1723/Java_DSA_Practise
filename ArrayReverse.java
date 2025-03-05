package DSA;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
    int[] arr ={2,4,6,8};
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ReverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp =  arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
}
