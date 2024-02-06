package twoDArrays;

import java.util.Scanner;

public class Mutiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2= new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid input");
        }

        int[][] prod = new int[r1][c2];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//input
// 2 3
// 1 2 3
// 1 2 3
// 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
//output
// 6 12 18 24
// 6 12 18 24