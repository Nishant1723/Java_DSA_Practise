package DSA;
public class BinarySearch {
    public static void main(String[] args) {
//    int [] arr = {0,-3,-1,2,3,4,6,8,9,12,18,20,22};
        int[] arr = {99,90,88,77,66,55,44,33,22};
    int target = 66;
    int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        FIND THE ARRAY IS SORTED IN ASCENDING OR DESCENDING
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isASC) {
               if(target < arr[mid]) {
                   end = mid-1;
               }
               else if(target > arr[mid]) {
                   start = mid+1;
               }
            } else {
                if(target > arr[mid]) {
                    end = mid-1;
                }
                else if(target < arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
