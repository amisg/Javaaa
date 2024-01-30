package patterns;

import java.util.Scanner;

public class MutiplicationPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=10;i++){
            int val = x * i;
            System.out.println(x + "*" + i + "=" +val);
        }
        sc.close();
    }
}
