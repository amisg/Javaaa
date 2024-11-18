package Stringss;

import java.util.Scanner;

public class Flips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coins = sc.next();
        sc.close();
        int n = coins.length();
        int flip = 0;
        for (int i = 0; i < n; i++) {
            char ch = coins.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                flip++;
            } else if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
                flip++;
            }
        }
        System.out.println(flip);
    }
}

/*
 * they have given one side of coin we need to check coin valid r not
 * valid -> 1.if its vowel then we should check the other side is even if even
 * then we sholud flip &&
 * 2.if we have odd then we sholud flip bcz we need to check other side is even
 * so we shold flip
 * invalid -> other than vowel its invalid
 */

// input
// 1eijk
// output
// 3