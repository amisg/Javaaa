package Stringss;

import java.util.Scanner;

public class FormPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        sc.close();
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                arr[i] = arr[j];
            }
            i++;
            j--;
        }
        String ss = new String(arr);
        System.out.println(ss);
    }
}
