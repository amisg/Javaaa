package Stringss;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        toggle(s);
        sc.close();
    }
    public static void toggle(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int ch = sb.charAt(i);
            if (ch>='a' && ch<='z') {
                char uc = (char)('A' + ch - 'a');
                sb.setCharAt(i, uc);
            } else if (ch>='A' && ch<='Z') {
                char lc = (char)('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
        }
        System.out.println(sb);
    }
}


//input
// pepCODing
//output
// PEPcodING