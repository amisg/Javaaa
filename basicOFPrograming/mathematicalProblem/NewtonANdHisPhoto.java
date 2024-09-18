package basicOFPrograming.mathematicalProblem;

import java.util.Scanner;

public class NewtonANdHisPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int tc = sc.nextInt();       
       
        for (int i = 1; i <= tc; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if ( h < l || w < l ) {
                System.out.println("upload again");
            } else if (h==w) {
                System.out.println("accepted");
            } else {
                System.out.println("crop it");
            }
        }
        sc.close();
        
    }
}
