package oneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArraySortedAndRotatedClockwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dup[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dup[i] = arr[i];
        }
        sc.close();  

        Arrays.sort(dup);

        int minIdx = findMinIndex(arr); 
        boolean insAns = true;
        if (arr[0]<=arr[n-1]) {
            insAns = false;
        }
        for (int i = 0; i < n; i++) {
            if (dup[i]!=arr[(i+minIdx)%n]) {
                insAns = false;
            }
        }

        int maxIdx = findMaxIndex(arr);
        boolean decAns = true;
        if (arr[0]>=arr[n-1]) {
            decAns = false;
        }
        for (int i = 0; i < n; i++) {
            if (dup[n-i-1]!=arr[(i+maxIdx)%n]) {
                decAns = false;
            }
        }

        if(insAns || decAns){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static int findMinIndex(int arr[]){
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minValue){
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int arr[]){
        int maxValue = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxIndex = i;
                maxValue = arr[i];
            }
        }
        return maxIndex;
    }
}

// input
// 4
// 3 4 1 2

// 3
// 1 3 2