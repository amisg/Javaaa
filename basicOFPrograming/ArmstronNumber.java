package basicOFPrograming;

import java.util.Scanner;

public class ArmstronNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean ans = isArmstrong(n);
        // System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return sum==original;
    }
}

//input
// 153
//output
// true

// armStrong numbers between 100 & 1000 are 153 370 371 407 