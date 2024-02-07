package Array.leetcode;

import java.util.ArrayList;

public class SeparateDigits {
    public static void main(String[] args) {
        int[] arr = {13,25,83,77};
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i];
            while (n != 0) {
                int digit = n % 10;
                li.add(digit);
                n /= 10;
            }
        }
        int[] ans = new int[li.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = li.get(li.size() - 1 - i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

//output
// 1 3 2 5 8 3 7 7 
