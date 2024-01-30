package patterns;

import java.util.Scanner;

public class UmberellaPetternNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2*n-3;
        for(int i=1;i<=n;i++){
            int val = 1;
            for(int j=1;j<=star;j++){
                System.out.print(val);
                val++;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if (i==n) {
                star--;
                val--;
            }
            for(int j=1;j<=star;j++){
                val--;
                System.out.print(val);
            }
            star++;
            space -= 2;
            System.out.println();
        }
        sc.close();
    }
}
