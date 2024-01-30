package functions.numberSystem;

import java.util.Scanner;

public class GetValueToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int f = getValueToDecimal(n, b);
        System.out.println(f);
        sc.close();
    }
    public static int getValueToDecimal(int n,int b){
        int rev = 0;
        int p = 1;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            rev += rem * p;
            p = p * b;
        }
        return rev;
    }
}

// input
// 1172
// 8
//output
// 634