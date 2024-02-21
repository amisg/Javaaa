package searching.binarySearch.leetCode;

import java.util.Arrays;

public class FirstAndLastIndexSortedArray {
    public static void main(String[] args) {
        int arr[] = {10 ,10, 10, 20, 20, 20, 20, 30, 30, 30};
        int arr1[] = {-1,-1};
        int start = search(arr, 20, true);
        int end = search(arr, 20, false);
        arr1[0] = start;
        arr1[1] = end;
        System.out.println(Arrays.toString(arr1));
    }
    static int  search(int[] arr,int target,boolean isFirstoccurance){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstoccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
