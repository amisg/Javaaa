package searching.binarySearch.leetCode;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = searchPosition(arr, target);
        System.out.println(ans);
        sc.close();
    }
    public static int searchPosition(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <=  right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

//input
// 4
// 1 3 5 7
// 2
//output
// 1