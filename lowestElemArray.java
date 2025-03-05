package DSA;

public class lowestElemArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,-2, 4,6};
        System.out.println(lowElement(arr));
    }

    public static int lowElement(int[] arr) {
        int first = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(first > arr[i]) {
                first = arr[i];
            }
        }
        return first;
    }
}
