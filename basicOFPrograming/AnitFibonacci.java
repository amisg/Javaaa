package basicOFPrograming;

import java.util.Scanner;

public class AnitFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
        
    }
}
