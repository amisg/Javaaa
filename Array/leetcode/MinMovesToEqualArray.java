package Array.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MinMovesToEqualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = moves(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int moves(int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start < end) {
            ans += arr[end] - arr[start];
            start++;
            end--;
        }
        return ans;
    }
}


//input
// 4
// 1 10 2 9
//output
// 16
