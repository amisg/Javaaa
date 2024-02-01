package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void reverse(int[] arr,int i,int j){ 
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] arr,int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
}


//input
// 5
// 1 2 3 4 5
// 2
//output
// 4 5 1 2 3