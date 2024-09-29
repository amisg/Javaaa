package twoDArrays;

import java.util.Scanner;

public class ZigTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < rows; i++) {
            int r = i;
            int c = 0;
            while (r>=0 && c<cols) {
                System.out.print(arr[r][c]+" ");
                r--;
                c++;
            }
            System.out.println();
        }

        for (int i = 1; i < cols; i++) {
            int r = rows - 1;
            int c = i;
            while (r>=0 && c<cols) {
                System.out.print(arr[r][c]+" ");
                r--;
                c++;
            }
            System.out.println();
        }
    }
}
