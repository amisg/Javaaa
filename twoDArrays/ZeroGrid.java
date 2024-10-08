package twoDArrays;
import java.util.Scanner;

public class ZeroGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ones = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int num = sc.nextInt();
                if(num==1){
                    ones++;
                }
            }
        }
        sc.close();
        if (ones == 0) {
            System.out.println(0);
        } else if (ones <= 3) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
