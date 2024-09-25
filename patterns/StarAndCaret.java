package patterns;

import java.util.Scanner;

public class StarAndCaret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
    static void pattern(int n){
        System.out.println("*");
        for (int i = 2; i <= n-1; i++) {
            System.out.print("*");
            for (int j = 1; j <= i-1; j++) {
                System.out.print("^");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n+1; i++) {
            System.out.print("*");
        }
    }
}
