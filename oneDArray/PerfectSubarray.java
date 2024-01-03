package oneDArray;

import java.util.*;

public class PerfectSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = perfectSubarray(arr);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPerfectSquare(int num){
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    public static int perfectSubarray(int arr[]){
        int n = arr.length;
        int count = 0;

        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                curSum += arr[j];
                if (isPerfectSquare(curSum)) {
                    count++;
                }
            }
        }
        return count;
    }
}

// input
// 4
// 1 4 2 3