package basicOFPrograming.mathematicalProblem;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = countDivisor(l, n, m);
        System.out.println(ans);
        sc.close();
    }

    static int countDivisor(int l,int n,int m){
        int count = 0;
        for (int i = l; i <= n ; i++) {
            if (i % m == 0) {
                count++;
            }
        }
        return count;
    }
}
