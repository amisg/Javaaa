package Stringss;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans1 = compression1(s);
        System.out.println(ans1);
        String ans2 = compression2(s);
        System.out.println(ans2);
        sc.close();
    }
    public static String compression1(String str){
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }
    public static String compression2(String str){
        String s = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
        if (count > 1) {
            s += count;
            count = 1;
        }
        return s;
    }
}



//input
// aaabbbccdeeef
//output
// abcdef
// a3b3c2de3f