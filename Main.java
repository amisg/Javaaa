
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findMinHeight(arr, k));
    }

    public static int findMinHeight(int[] trees, int K) {
        if (trees == null || trees.length == 0 || K < 0) {
            return -1;
        }

        Arrays.sort(trees);
        int low = 0, high = trees[trees.length - 1];
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalWood = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    totalWood += (tree - mid);
                }
            }

            if (totalWood <= K) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}