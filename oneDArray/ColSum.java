package oneDArray;

import java.util.Scanner;

public class ColSum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();            
            }
        }

        int maxCol = Integer.MIN_VALUE;
        
        for(int j=0;j<cols;j++){
            int colsum = 0;
            for(int i=0;i<rows;i++){
                colsum += arr[i][j];
            }
            if(colsum > maxCol){
                maxCol = colsum;
            }
        }
        System.out.println(maxCol);
        sc.close();
    }
}
