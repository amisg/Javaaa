package patterns;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n/2;
        int star = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                if(i==n/2+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }   
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<=n/2){
                star++;
            }else{
                star--;
            }
            System.out.println();
        }
        sc.close();
    }
}
