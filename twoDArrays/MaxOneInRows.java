package twoDArrays;

import java.util.*;

public class MaxOneInRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowIndex = findMaxOne(arr);
        System.out.println(rowIndex); 
        sc.close();
    }
    static int findMaxOne(int arr[][]){
        int onessCount = 0;
        int rowIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int onesCount = oneCount(arr[i]);
             if (onesCount>onessCount) {
                onessCount = onesCount;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
   
    static int oneCount(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
    
}
