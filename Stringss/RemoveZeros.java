package Stringss;

import java.util.Scanner;

public class RemoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        sc.close();
        // String ones = binary.replace("0", "");
        // System.out.println(Integer.parseInt(ones, 2));
        int n = binary.length();
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            // char ch = binary.charAt(i);
            if (binary.charAt(i) == '1') {
                int pow = (int) Math.pow(2, count);
                ans = ans + pow;
                count++;
            }
        }
        System.out.println(ans);
        // System.out.println(removeOnes(binary));
    }

    // static void removeOnes(String binary) {
    // int ans = 0;
    // int oneCount = 0;
    // for (int i = 0; i < binary.length(); i++) {
    // if (binary.charAt(i) == '1') {
    // oneCount++;
    // }
    // }
    // for (int i = 0; i < oneCount; i++) {
    // ans += (int) (Math.pow(2, i));
    // }
    // System.out.println(ans);
    // }
}

// input
// 10110 , 1111
// output
// 7 , 15
