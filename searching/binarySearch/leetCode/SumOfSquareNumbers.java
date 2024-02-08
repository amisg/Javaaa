package searching.binarySearch.leetCode;

import java.util.Scanner;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        boolean ans = square(c);
        System.out.println(ans);
        sc.close();
    }
    public static boolean square(int c){
        long left = 0;
        long right = (long)Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            }else if (sum < c) {
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}

//input
// 5      
// true
// 3
// false