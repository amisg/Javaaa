package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        leftRotate(arr);
        rightRotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotate(int[] arr){
        int n = arr.length;
        int i = 0;
        int temp = arr[0];
        for (; i+2 < n; i=i+2) {
            arr[i] = arr[i+2];
        }
        arr[i] = temp;
    }

    public static void rightRotate(int[] arr){
        int n = arr.length;
        int i = n - 1;
        if (i%2==0)  i--;
        int temp = arr[i];
        for (;i-2 >= 1; i=i-2) {
            arr[i] = arr[i-2];
        }
        arr[i] = temp;
    }
}
