package basicOFPrograming;

import java.util.Scanner;

public class PrimePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}


//input
//5 - 15
//output
//5 7 11 13