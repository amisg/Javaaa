package sorting;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
       int arr[] = {5,4,3,2,1};
       System.out.println(Arrays.toString(arr));
    //    selectionSort(arr);
    //    bubbleSort(arr);
    insertionSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]>arr[minIndex]) {
                    minIndex = j;
                }
                swap(arr, minIndex, j);
            }
        }
    }
    static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                swap(arr, j, j+1);
                }
            }
        }
    }
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {    
                    arr[j+1] = arr[j];
                    j--;                
            }
            arr[j+1]=key;
        }
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
