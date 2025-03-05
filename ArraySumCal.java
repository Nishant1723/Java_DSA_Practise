package DSA;

public class ArraySumCal {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        System.out.println(CalSum(arr));
    }

    public static int CalSum(int[] arr) {
        int sum =0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
