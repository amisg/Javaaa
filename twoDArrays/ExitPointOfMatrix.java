package twoDArrays;

import java.util.Scanner;

public class ExitPointOfMatrix {
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
        int dir = 0;
        int i = 0;
        int j = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir==0) {
                j++;
            } else if (dir==1) {
                i++;
            } else if (dir==2) {
                j--;
            } else if (dir==3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        sc.close();
    }
}


//input
// 4
// 4
// 0 0 1 0
// 1 0 0 1
// 0 0 0 1
// 1 0 1 0
//output
// 2
// 0