package Array.leetcode;

public class MaxSumWithExactlyKElements {
    public static void main(String[] args) {
        int arr[] = {34,23,46,88,97};
        int k = 3;
        int sum = 0;
        int max = 0;
        for (int num : arr) {
            max = Math.max(max,num);
        }
        while (k > 0) {
            sum += max;
            max++;
            k--;
        }
        System.out.println(sum);
    }
}
