package Stringss;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s,String t){
        int[] freq1 = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            freq1[index] = freq1[index] + 1;
        }
        int[] freq2 = new int[26];
        int m = t.length();
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            int index = ch - 'a';
            freq2[index] = freq2[index] + 1;
        }
        boolean ans = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                ans = false;
                break;
            }
        }
        return ans;
    }
}


// cafe care
// true

// race rare
// false