package searching.binarySearch;

public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 10, 13, 15, 90, 100, 115, 140, 165};
        int target = 140;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int arr[],int target){
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp; 
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int arr[],int target,int start,int end){
          while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
