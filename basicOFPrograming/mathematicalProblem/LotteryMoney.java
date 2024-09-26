package basicOFPrograming.mathematicalProblem;

import java.util.Scanner;

public class LotteryMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long k = sc.nextLong();
        int ans = distributingMoney(x, y, z, k);
        System.out.println(ans);
        sc.close();
    }
    public static int distributingMoney(long x,long y,long z,long k){
        long finalAmount = x+y+z+k;
        if (finalAmount % 3 == 0) {
            long share = finalAmount / 3; 
            if (share < x || share < y || share < z) {
                return 0;
            }
            return 1;
        }
        return 0;
    }
}

//input
// 1 2 8 4
//output
// 0


//input
// 1 2 3 3
//output
// 1