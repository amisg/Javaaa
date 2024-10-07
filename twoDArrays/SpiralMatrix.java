package twoDArrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int total = n * n;
        int number = 1;
        int[][] arr = new int[n][n];
        int startRow = 0, startCol = 0, endRow = n-1, endCol = n-1;
        while (number <= total) {
            for (int col= startCol; col <= endCol; col++) {
                arr[startRow][col] = number;
                number++;
            }
            startRow++;
            for (int row = startRow; row <= endRow; row++) {
                arr[row][endCol] = number;
                number++;
            }
            endCol--;
            for (int col = endCol; col>=startCol; col--) {
                arr[endRow][col] = number;
                number++;
            }
            endRow--;
            for (int row = endRow; row >= startRow; row--) {
                arr[row][startCol] = number;
                number++;
            }
            startCol++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
