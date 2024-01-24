package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minSum = minimumSum(n);
        System.out.println(minSum);
        sc.close();
    }
    static int minimumSum(int num){
        String s = String.valueOf(num);
        int[] arr = new int[4];
        int i = 0;
        for (char c : s.toCharArray()) {
            arr[i++] = c - '0';
        }
        Arrays.sort(arr);
        int d1 = arr[0] , d2 = arr[1] , d3 = arr[2] , d4 = arr[3];
        String n1 = "" + d1 + d3;
        String n2 = "" + d2 + d4;
        return Integer.parseInt(n1) + Integer.parseInt(n2);
    }
}

//---input
//2932
//output
//52