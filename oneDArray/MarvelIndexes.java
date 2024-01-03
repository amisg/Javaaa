package oneDArray;

import java.util.*;
public class MarvelIndexes {

    public static int countMarvelIndexes(int[] A, int K) {
        int count = 0;

        // Calculate prefix sum
        int[] prefixSum = new int[A.length];
        prefixSum[0] = (A[0] % K == 0) ? 1 : 0;
        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + ((A[i] % K == 0) ? 1 : 0);
        }

        // Calculate suffix sum
        int[] suffixSum = new int[A.length];
        suffixSum[A.length - 1] = (A[A.length - 1] % K == 0) ? 1 : 0;
        for (int i = A.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + ((A[i] % K == 0) ? 1 : 0);
        }

        // Compare prefix sum and suffix sum to find marvel indexes
        for (int i = 0; i < A.length; i++) {
            int leftCount = (i > 0) ? prefixSum[i - 1] : 0;
            int rightCount = (i < A.length - 1) ? suffixSum[i + 1] : 0;

            if (leftCount <= rightCount) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = countMarvelIndexes(A, K);
        System.out.println( result);
    }
}
// input
// 7 4
// 3 4 3 4 5 4 5

