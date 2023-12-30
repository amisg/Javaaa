package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {7,3,9,4,1};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickSort(int arr[],int left,int right){
        if(left<right){
            int pivotIndex = getPivotIndex(arr,left,right);
            quickSort(arr, 0, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }
    }
    public static int getPivotIndex(int arr[],int left,int right){
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j]<arr[right]) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }
}
