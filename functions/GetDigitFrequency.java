package functions;

import java.util.Scanner;

public class GetDigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigfreq(n, d);
        System.out.println(f);
        sc.close();
    }
    public static int getDigfreq(int n,int d){
        int count = 0;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            if (rem==d) {
                count++;
            }
        }
        return count;
    }
}

//input 
// 14683248
//4
//output = 2