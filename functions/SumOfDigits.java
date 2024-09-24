package functions;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sum(452);
        System.out.println(sum);
    }

    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
}
