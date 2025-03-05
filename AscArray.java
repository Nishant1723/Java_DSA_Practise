package DSA;

import java.util.Arrays;

public class AscArray {
    public static void main(String[] args) {

        int[] arr = {4,2,5,8,7,6,3,1,2};
        AscArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void AscArr(int[]arr) {
        boolean swapped;
        for(int i=0; i < arr.length - 1; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++ ) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                     arr[j] = arr[j - 1];
                     arr[j - 1] = temp;
                     swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
