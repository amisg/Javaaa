package oneDArray;

import java.util.*;

public class SchoolPicnicTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int buses[] = new int[n];
        int scooters[] = new int[m];
        for (int i = 0; i < buses.length; i++) {
            buses[i] = sc.nextInt();
        }
        for (int i = 0; i < scooters.length; i++) {
            scooters[i] = sc.nextInt();
        }
        sc.close();
        int result = minimumTransportationCost(c1,c2,c3,c4,n,m,buses,scooters);
        System.out.println(result);
    }
    static int minimumTransportationCost(int c1,int c2,int c3,int c4,int n,int m,int buses[],int scooters[]){
        int totalCost = 0;
        int busCost = 0;
        for (int i = 0; i < n; i++) {
            busCost += Math.min(c1*buses[i],c2);
        }
        busCost = Math.min(busCost,c3);

        int scootersCost = 0;
        for (int i = 0; i < m; i++) {
            scootersCost += Math.min(c1*scooters[i], c2);
        }
        scootersCost = Math.min(scootersCost,c3);

        totalCost = Math.min(scootersCost+ busCost,c4);
        return totalCost;
    }
}
