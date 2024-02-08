package twoDArrays;

import java.util.Scanner;

public class WaveTraversal {
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
        //wave traversal
        for (int j = 0; j < arr[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}

//input
// 3
// 3
// 1 2 3
// 4 5 6
// 7 8 9
//output
// 1 4 7 8 5 2 3 6 9 