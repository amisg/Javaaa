package Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLogic {
    public static void main (String[] args) {
    
        try (// Your code here
       Scanner sc = new Scanner(System.in)) {
            String words[] =  sc.nextLine().split("\\s+");
            System.out.println(Arrays.toString(words));
            int wordLength = words.length;
            for(int i=0;i<wordLength;i++){
                if(i%2==1){
                    StringBuffer sb = new StringBuffer(words[i]);
                    sb.reverse();
                    System.out.print(sb+" ");
                }else{
                    System.out.print(words[i]+" ");
                }
            }
            sc.close();
        }
    }
}
// i/p: But, why?
// o/p: But,? yhw