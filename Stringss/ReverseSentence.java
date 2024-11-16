package Stringss;

public class ReverseSentence {
    public static void main(String[] args) {
        String S = "i am a good programmer";
        String words[] = S.split(" ");
        int n = words.length;
        reverse(words, 0, n - 1);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    static void reverse(String arr[], int i, int j) {
        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
