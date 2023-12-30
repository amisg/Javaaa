package oops;
import java.util.Scanner;

public class MaxOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int operationsDone = findMaxOperations(arr);
        System.out.println(operationsDone);
        sc.close();
    }

    static boolean allEven(int arr[]){
        for (int i = 0; i< arr.length; i++) {
            if (arr[i]%2!=0) {
                return false;
            }
        }
        return true;   
    }

    static int findMaxOperations(int arr[]){
        int maxOperations = 0;
        while (allEven(arr)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] /= 2;
            }
            maxOperations++;
        }
        return maxOperations;
    }
}
