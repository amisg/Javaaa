package Array.leetcode;

public class ReplaceElementRightSide {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int ans[] = replaceElement(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] replaceElement(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (i == arr.length - 1) {
                ans[i] = -1;
            } else {
                ans[i] = Math.max(arr[i+1], ans[i+1]);
            }
        }
        return ans;
    }
}

// output
// 18 6 6 6 1 -1 