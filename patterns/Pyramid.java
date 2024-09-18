package patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = (2 * rows) - 1;
        for (int i = 1; i <= rows; i++) {
            int space = rows - i;
            for (int j = 1; j <= cols; j++) {
                if (j <= space || j > (cols - space)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
