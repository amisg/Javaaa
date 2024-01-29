package basicOFPrograming;

import java.util.Scanner;

public class RotateNumberByK {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        int div = 1;
        int mult = 1;
        for(int i=1;i<=nod;i++){
            if (i<=k) {
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }
        int r = n % div;
        int q = n / div;
        int rotatedNumber = r * mult + q;
        System.out.println(rotatedNumber);
        sc.close();
    }
}
