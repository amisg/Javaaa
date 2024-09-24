package functions;

import java.util.Scanner;

public class SumOfSumsOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + digitSum(num);
        } 
        sc.close();
        System.out.println(sum);    
    }

    static int digitSum(int num){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }   
}
