package Array;

import java.util.Scanner;

public class SubArrayOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subArray(arr);
        sc.close();
    }
    public static void subArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}

//input
// 5
// 1 2 3 4 5

//output
// 1 
// 1 2 
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 2
// 2 3
// 2 3 4
// 2 3 4 5
// 3
// 3 4
// 3 4 5
// 4
// 4 5 
// 5