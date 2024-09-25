package patterns;

import java.util.Scanner;

public class StarsAndHastags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n; i=i+2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("##");
            }
            System.out.println();
        }
        sc.close();
    }
}
