package searching.binarySearch;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int firstIndex = firstIndex(arr, data);
        int lastIndex = lastIndex(arr, data);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        sc.close();
    }
    public static int firstIndex(int[] arr,int data){
        int left = 0;
        int right = arr.length - 1;
        int fi = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid]==data) {
                fi = mid;
                right = mid - 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return fi;
    }
    public static int lastIndex(int[] arr,int data){
        int left = 0;
        int right = arr.length - 1;
        int li = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid]==data) {
                li = mid;
                left = mid + 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return li;
    }
}


//input
// 10
// 10 10 10 20 20 20 20 30 30 30
// 20
//output
// 3
// 6