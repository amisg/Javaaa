package functions.numberSystem;

import java.util.Scanner;

public class AnybaseToAnyBAse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int decimal = getValueToDecimal(n, b1); 
        int anyBase = getValueAnybase(decimal, b2);
        System.out.println(anyBase);
        sc.close();
    }
    public static int getValueToDecimal(int n,int b1){
        int rev = 0;
        int p = 1;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            rev += rem * p;
            p = p * b1;
        }
        return rev;
    }
    public static int getValueAnybase(int n,int b2){
        int rev = 0;
        int p = 1;
        while (n>0) {
            int rem = n % b2;
            n = n / 2;
            rev += rem * p;
            p = p * 10; 
        }
        return rev;
    }
}

//input
// 172
// 8
// 2
//output
// 1111010