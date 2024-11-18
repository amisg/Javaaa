package Stringss;

import java.util.Scanner;

public class DividibilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        sc.close();
        int n = number.length();
        int digitSum = 0;
        for (int i = 0; i < n; i++) {
            int val = number.charAt(i) - '0';
            digitSum += val;
        }
        if (digitSum % 3 == 0 && number.charAt(n - 1) == '0') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// input
// 120
// output
// Yes

// 7845
// No