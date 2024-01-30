package functions.numberSystem;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int convertedNumber = getConvertions(n, b);
        System.out.println(convertedNumber);
        sc.close();
    }
    public static int getConvertions(int n,int b){
        int rev = 0;
        int p = 1;
        while (n>0) {
            int rem = n % b;
            n = n / b;
            rev += rem * p;
            p = p * 10;
        }
        return rev;
    }
}

// input
// 63
// 8
// output
// 77