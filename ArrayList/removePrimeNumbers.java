package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        removePrimes(li);
        System.out.println(li);
        sc.close();
    }
    public static void removePrimes(ArrayList<Integer> li){
        for(int i = li.size() - 1;i >= 0;i--){
            int val = li.get(i);
            if (isPrime(val)) {
                li.remove(i);
            }
        }
    }
    public static boolean isPrime(int val){
        for (int i = 2; i * i <= val ; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}



//input
// 5
// 2 3 17 4 9
//output
// [4, 9]