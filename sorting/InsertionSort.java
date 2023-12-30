package sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {10,4,6,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));   
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
