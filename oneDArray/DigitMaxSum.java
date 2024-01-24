package oneDArray;

import java.util.Scanner;

public class DigitMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = sumOfMax(arr);
        System.out.println(result);
        sc.close();
    }
    static int sumOfMax(int arr[]){
        int sum = 0;
        for (int num : arr) {
            int digit = digitMax(num);
            sum += digit;  
        }
        return sum;
    }
    static int digitMax(int num){
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit,digit);
            num /= 10;
        }
        return maxDigit;
    }
}
// intput
// 4
// 234 456 567 678
// output
// 25 https://github.com/selvakanna55/newton-may-2022-2/blob/master/src/DSA2_Questions.txt