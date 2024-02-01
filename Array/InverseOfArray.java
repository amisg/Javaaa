package Array;

import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = inverse(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }
}


//input
// 5
// 2 3 0 4 1  
//output
// 2 4 0 1 3