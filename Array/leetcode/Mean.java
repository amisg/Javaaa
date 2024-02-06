package Array.leetcode;

import java.util.Arrays;

public class Mean {
    public static void main(String[] args) {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        int len = arr.length;
        Arrays.sort(arr);
        double limit = 0.05 * len;
        int start = (int)limit;
        int end = len - (int)limit;
        double sum = 0;
        double new_length = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
            new_length++;
        }
        double mean = sum / new_length;
        System.out.println(mean);
    }
}
