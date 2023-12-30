package oneDArray;

import java.util.*;

public class GameOfPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int t=0;t<T;t++){
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                boolean onePile = false;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                    if(arr[i]==1){
                        onePile = true;
                    }
                }
                if(onePile){
                    System.out.println("CHEF");
                }else{
                    if (sum%2==0) {
                        System.out.println("CHEFINA");
                    }else{
                        System.out.println("CHEF");
                    }
                }
            }
        sc.close();
    } 
}

 


