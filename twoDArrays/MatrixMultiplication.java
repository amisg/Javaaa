package twoDArrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int row2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int m1[][] = new int[row1][cols1];
        int m2[][] = new int[row2][cols2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < cols1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < cols2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum = sum + (m1[i][k] * m2[k][j]);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
