package Stringss;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
        
    }
}


// input
// abcd
//output
// a
// ab
// abc
// abcd
// b
// bc
// bcd
// c
// cd
// d