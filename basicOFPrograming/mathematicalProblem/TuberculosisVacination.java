package basicOFPrograming.mathematicalProblem;

import java.util.Scanner;

public class TuberculosisVacination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 1; i <= t; i++) {
            int people = sc.nextInt();
            int days = sc.nextInt();
            int risk = 0;
            int noRisk = 0;
            for (int j = 1; j <= people; j++) {
                int num = sc.nextInt();
                if (num <= 9 || num >= 80) {
                    risk++;
                } else {
                    noRisk++;
                }
            }
            sc.close();
            int riskDays = risk / days;
            if (risk%days != 0) {
                riskDays++;
            }
            int noRiskDays = noRisk / days;
            if (noRisk%days != 0) {
                noRiskDays++;
            }
            int totalDays = riskDays + noRiskDays;
            System.out.println(totalDays);
        }
    }
}

//input
// 1
// 5 2
// 9 81 22 28 30
//output
// 3