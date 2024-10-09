package Stringss;

import java.util.Scanner;

public class VowelRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        for (char ch : word.toCharArray()) {
            if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
                continue;
            } else {
                System.out.print(ch);
            }
        }
    }
}
