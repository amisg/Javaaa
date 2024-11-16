package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int i = 0;
        int j = str.length() - 1;
        boolean ans = checkPalindrome(str, i, j);
        System.out.println(ans);
    }

    static boolean checkPalindrome(String str, int i, int j) {
        if (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                return checkPalindrome(str, ++i, --j);
            }
        }
        return true;
    }
}
