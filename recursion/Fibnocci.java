package recursion;

public class Fibnocci {
    public static void main(String[] args) {
        int n = 4;
        int ans = fibnocci(n);
        System.out.println(ans);
    }

    static int fibnocci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibnocci(n - 1) + fibnocci(n - 2);
    }
}
