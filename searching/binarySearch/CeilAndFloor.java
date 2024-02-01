package searching.binarySearch;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        ceilAndFloor(arr, data);
        sc.close();
    }
    public static void ceilAndFloor(int arr[],int data){
        int ceil = 0;
        int floor = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid]==data) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if (data < arr[mid]) {
                right = mid - 1;
                ceil = arr[mid];
            } else {
                left = mid + 1;
                floor = arr[mid];
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
}
//input
// 10
// 10 20 30 40 50 60 70 80 90 100
// 74
//output
// 70
// 80