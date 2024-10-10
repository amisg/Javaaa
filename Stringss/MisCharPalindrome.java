package Stringss;

import java.util.Scanner;

/**
 * MisCharPalindrome
 */
public class MisCharPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        int count = 0;
        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                count++;
            }
            i++;
            j--;
        }
        System.out.println(count);
    }
}