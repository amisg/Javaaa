package functions;
import java.util.Scanner;
public class NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = fact(n);
        int nmrfact = fact(n-r);
        int npr = nfact/nmrfact;
        System.out.println(npr);
        sc.close();
    }
    public static int fact(int x){
        int val = 1;
        for(int i=1;i<=x;i++){
            val = val * i;
        }
        return val;
    }
}
