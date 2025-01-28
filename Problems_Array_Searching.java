package DSA;
public class Problems_Array_Searching {
    public static void main(String[] args) {


//        1.Ceiling
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 13;
//        int ans = Ceiling(arr, target);
//        System.out.println(ans);

//        2.FLOOR
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 19;
//        int ans = Floor(arr, target);
//        System.out.println(ans);
//

        // 3.Smallest and greater than target
//        char[] letters = {'c', 'f', 'g', 'j'};
//        char target = 'c';
//        char ans = smallest(letters,target);
//        System.out.println(ans);

//        4.Finding the occurance of the char in the array but only first and last

//        int[] nums = {5, 7, 7, 8, 7, 10};
//        int target = 7;
//        int[] ans = searchRange(nums, target);
//        System.out.println(ans[0] + "," + ans[1]);

//         5.Searching the target in the infinite array

//        int[] arr = {2,6,8,10,14,16,18,20,23,24,25,26,29,30,30,34,38,39,40};
//        int target = 30;
//        int result = ans(arr,target);
//        System.out.println(result);

        //   6. Finding a peak in the mountain array

//        int[] arr = {2,3,8,6,5,4,3};
//        int ans = peakIndexInMountainArray(arr);
//        System.out.println(ans);

        // 7. Finding the target element from mountain array

//        int[] arr = {2,4,6,8,5,3,1};
//        int target = 6;
//        int ans = search(arr, target);
//        System.out.println(ans);

        //   8. Doing searching the Rotated array

//        int[] arr = {4,5,6,7,0,1,2};
//        System.out.println(findPivot(arr));
//        int target = 5;
//        System.out.println(Search(arr,target));

        //     9.Finding the count of rotation

//        int[] arr = {4,5,6,0,1,2};
//        System.out.println(countRotations(arr));

        // 10.Square rooot without using default function

        int x = 25;
        int ans = sqr(x);
        System.out.println(ans);

    }



    //        1.Ceiling
//    static int Ceiling(int[] arr, int target) {
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return start;
//}

    //        2.FLOOR
//    static int Floor(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return end;
//
//    }

// 3.Smallest and greater than target

    //    static char smallest(char[] letters, char target) {
//    int start = 0;
//    int end = letters.length - 1;
//    while(start <= end) {
//        int mid = start + (end-start) /2;
//        if(target < letters[mid]) {
//            end = mid -1;
//        } else {
//            start = mid + 1;
//        }
//    }
//    return letters[start % letters.length];


//        4.Finding the occurance of the char in the array but only first and last

//    static int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1, -1};
//        int start = search(nums, target , true);
//        int end = search(nums, target, false);
//
//        ans[0] = start;
//        ans[1] = end;
//
//        return ans;
//    }
//static int search(int[] nums, int target, boolean findstartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//        while(start <=end) {
//            int mid = start + (end - start)/2;
//            if(target > nums[mid]) {
//                start = mid+1;
//            } else if (target < nums[mid]) {
//                end = mid - 1;
//            } else {
//                ans = mid;
//                if(findstartIndex) {
//                    end = mid-1;
//                } else {
//                    start = mid +1;
//                }
//            }
//        }
//        return ans;
//}

//         5.Searching the target in the infinite array
//    static  int ans(int [] arr, int targte) {
//        int start = 0;
//        int end = 1;
//        while(targte > arr[end]) {
//            int temp = end;
//            end = end + (end-start + 1) * 2;
//            start = temp;
//        }
//        return binarySearch(arr, targte, start ,end);
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//
//    }


//   6. Finding a peak in the mountain array
//    public static int peakIndexInMountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end) {
//            int mid = start + (end - start) / 2;
//                if(arr[mid] > arr[mid+1]) {
//                    end=mid;
//                } else {
//                    start = mid+1;
//                }
//        }
//        return start;
//    }

// 7. Finding the target element from mountain array

//    static int search(int[] arr, int target) {
//        int peak = peakIndexInMountainArray(arr);
//        int firstTry = orderAgnosticBs(arr, target, 0, peak);
//        if(firstTry != -1) {
//            return firstTry;
//        }
//        return orderAgnosticBs(arr,target, peak+1, arr.length-1);
//    }
//
//    public static int peakIndexInMountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end) {
//            int mid = start + (end - start) / 2;
//                if(arr[mid] > arr[mid+1]) {
//                    end=mid;
//                } else {
//                    start = mid+1;
//                }
//        }
//        return start;
//    }
//    public static int orderAgnosticBs(int [] arr, int target, int start, int end) {
//
////       FIND THE ARRAY IS SORTED IN ASCENDING OR DESCENDING
//        boolean isASC = arr[start] < arr[end];
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if(arr[mid] == target) {
//                return mid;
//            }
//            if(isASC) {
//                if(target < arr[mid]) {
//                    end = mid-1;
//                }
//                else if(target > arr[mid]) {
//                    start = mid+1;
//                }
//            } else {
//                if(target > arr[mid]) {
//                    end = mid-1;
//                }
//                else if(target < arr[mid]) {
//                    start = mid+1;
//                }
//            }
//        }
//        return -1;
//    }

//   8. Doing searching the Rotated array

//    static int Search(int[] nums, int target) {
//        int pivot = findPivot(nums);
//
//        if(pivot == -1) {
//        return binarySearch(nums,target,0,nums.length-1);
//        }
//        if(nums[pivot] == target) {
//            return pivot;
//        }
//        if(target >= nums[0]) {
//            return binarySearch(nums,target,0,pivot-1);
//        }
//        return binarySearch(nums , target , pivot+1, nums.length-1);
//
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//
//    static  int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if(mid<end && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
//            if(mid> start && arr[mid] < arr[mid-1]) {
//                return mid-1;
//            }
//            if(arr[mid] <= arr[start]){
//                end = mid-1;
//            } else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
//

//     9.Finding the count of rotation

//    public  static int countRotations(int[] arr) {
//        int pivot = findPivot(arr);
//        return pivot+1;
//    }
//
//    static  int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if(mid<end && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
//            if(mid> start && arr[mid] < arr[mid-1]) {
//                return mid-1;
//            }
//            if(arr[mid] <= arr[start]){
//                end = mid-1;
//            } else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }


// 10.Square rooot without using default function

    public static int sqr(int x) {
        if(x==0) {
            return 1;
        }
        int left = 1;
        int right = x;
        int result = 0;

        while(left<=right) {
            int mid = left + (right-left) / 2;
            int num = mid * mid;
            if(num < x) {
                result = mid;
                left =  mid +1;
            } else if (num == x) {
                return mid;
            } else {
                right = mid-1;
            }

        }
        return  result;
    }





























    }

