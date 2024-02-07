package searching.binarySearch.leetCode;

public class MaxCountPosAndNegInteger {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        int lastNegative = lastNegative(arr) + 1;
        int firstPositive = arr.length - firstPositive(arr);
        int ans = Math.max(lastNegative, firstPositive);
        System.out.println(ans);
    }
    public static int lastNegative(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < 0) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int firstPositive(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}


//output
// 3