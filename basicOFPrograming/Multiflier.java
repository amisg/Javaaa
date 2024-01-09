package basicOFPrograming;

import java.util.Scanner;

public class Multiflier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = calculateSum(n);
        System.out.println(sum);
        sc.close();
    }
    static int calculateSum(int n){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            sum += getUnitDigitSum(product);
        }
        return sum;
    }
    static int getUnitDigitSum(int num){
        while (num > 9) {
            int tempSum = 0;
            while (num > 0) {
                tempSum += num % 10;
                num /= 10;
            }
            num = tempSum;
        }
        return num;
    }
}
// input
// 1
// output
// 46