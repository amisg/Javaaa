package oneDArray;

import java.util.*;

public class EvenFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        evenFirst(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void evenFirst(int arr[]){
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num%2==0) {
                evenList.add(num);
            }else{
                oddList.add(num);
            }
        }
        int index = 0;
        for (int i = 0; i < evenList.size(); i++) {
            arr[index++] = evenList.get(i);
        }
        for (int i = 0; i < oddList.size(); i++) {
            arr[index++] = oddList.get(i);
        }
    }
}
