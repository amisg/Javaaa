package oneDArray;

import java.util.Scanner;

public class SubArrayProblem {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        sc.close();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = findSubarray(N, S, A);
        System.out.println(result);
    }
    private static String findSubarray(int N,int S,int[] A){
        for (int i = 0; i < A.length - N; i++) {
            int sum = 0;
            for (int j = i; j < i + N; j++) {
                sum += A[j];
            }
            if (sum == S) {
                return "Yes";
            }
        }
        return "No";
    }
}
// Sample Input
// 3 6
// Sample Output
// Yes
// Explanation
// The sum of elements at indices 0, 1, and 2 add up to 6 i. e. 1 + 2 + 3 = 6.