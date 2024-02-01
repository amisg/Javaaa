package Array;

import java.util.Scanner;

public class SubSetsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = (int)Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;
            for (int j = arr.length-1; j >=0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r==0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
        sc.close();
    }
}


//input
// 3
// 1 2 3
//output
// -       -       -
// -       -       3
// -       2       -
// -       2       3
// 1       -       -
// 1       -       3
// 1       2       -
// 1       2       3