package sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // int arr[] = {5,9,8,2,1};
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[],int left,int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int n = mid - left + 1;
        int m = right - mid;
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i+left];
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = left;

        while (i<n && j<m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i<n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j<m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
