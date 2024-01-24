package twoDArrays;

import java.util.Arrays;

public class MaximumUnitsOnTruck {

    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->-Integer.compare(a[1],b[1]));
        int maxUnits = 0;
        for(int[] box : boxTypes){
            if(truckSize < box[0]){
                return maxUnits + truckSize * box[1];
            }
            maxUnits += box[0] * box[1];
            truckSize -= box[0];
        }
        return maxUnits;
    }
    
}