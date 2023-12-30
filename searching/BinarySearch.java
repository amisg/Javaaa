package searching;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        System.out.println(result);
        sc.close();
    }
    static int binarySearch(int arr[],int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans = -1;
        while (left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(target<arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
