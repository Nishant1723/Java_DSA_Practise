package DSA;

import java.util.Arrays;

public class dublicateelemArray {
    public static void main(String[] args) {

        int[] arr = {2,2,5,8,8,3,6,9,4};
       dublicateElement(arr);
    }
    public static void dublicateElement(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j = i + 1; j <arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
