package recursion;

public class SumTillN {
    public static void main(String[] args) {

        int sum = sumTillN(1, 3);
        System.out.println(sum);

    }

    public static int sumTillN(int i, int n) {
        if (i > n) {
            return 0;
        }
        return i + sumTillN(i + 1, n);
    }
}
