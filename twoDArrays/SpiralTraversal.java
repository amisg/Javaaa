package twoDArrays;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int total = n * m;
        int count = 0;
        while (count < total) {
            for(int i = minRow, j = minCol ; i <= maxRow && count < total; i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minCol++;
            for(int  i = maxRow, j = minCol ; j <= maxCol && count < total; j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxRow--;
            for(int i = maxRow , j = maxCol ; i >= minRow && count < total; i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxCol--;
            for(int i = minRow, j = maxCol ; j >= minCol && count < total; j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minRow++;
        }
        sc.close();
    }
}

//input
// 3 
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
//output
// 1 5 9 10 11 12 8 4 3 2 6 7