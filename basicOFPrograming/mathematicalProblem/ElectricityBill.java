package basicOFPrograming.mathematicalProblem;

import java.util.Scanner;

public class ElectricityBill {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int units = sc.nextInt();
    sc.close();
    double amount = 0;

    if (units > 50){
        amount += (50 * 0.50);
        units -= 50;
    } else {
        amount += (units * 0.50);
        units = 0;
    }

    if (units > 100){
        amount += (100 * 0.75);
        units -= 100;
    } else {
        amount += (units * 0.75);
        units = 0;
    }

    if (units > 100){
        amount += (100 * 1.25);
        units -= 100;
    } else {
        amount += (units * 1.25);
        units = 0;
    }

    amount += (units * 1.5);

    double surgeCharge = amount * (0.2);

    double totalAmount = amount + surgeCharge;

    System.out.printf("%.2f",totalAmount);

   }
}

//input
// 600
//output
// 900.00

//input
// 85
//output
// 61.50