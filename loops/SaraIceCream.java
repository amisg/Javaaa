package loops;

public class SaraIceCream {
    public static void main(String[] args) {
        int noOfIcecreamsToday = 5;
        int days = 3;

        for (int i = 1; i <= days; i++) {
            int eat = noOfIcecreamsToday / 2;    
            int rem = noOfIcecreamsToday - eat;
            noOfIcecreamsToday = rem * 3;       
        }
        System.out.println(noOfIcecreamsToday);  
    }
}


//input 
//5 3
//output
//24