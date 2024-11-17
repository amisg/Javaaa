package recursion;

import java.util.Scanner;

public class ArraySumWoithoutLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(arraySum(arr, 0));
    }

    static long arraySum(int[] arr, int i) {
        long sum = 0;
        if (i < arr.length) {
            sum = arr[i] + arraySum(arr, ++i);
        }
        return sum;
    }
}

// input
// 4
// 3 5 6 7
// output
// 21