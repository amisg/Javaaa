package oneDArray;

import java.util.Scanner;

public class MinOperaionExceedingThresholdValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,10,11,2,3};
        int ans = minOperations(nums, 10);
        System.out.println(ans);
        sc.close();
    }

    static int minOperations(int[] nums,int k){
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < k) {
                count++;
            }
        }
        return count;
    }
}


//output
//3