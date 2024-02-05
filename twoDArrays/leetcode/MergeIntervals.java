package twoDArrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for (int[] row : result) {
            System.out.print(Arrays.toString(row));
        }
        
    }
    public static int[][] merge(int[][] intervals){
        if (intervals.length <= 1) {
            return intervals;
        }
        //comparing first element in both the arrays and sorting
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0], arr2[0]));

        //creating list with int[]->object
        List<int[]> result_arr = new ArrayList<>();

        int[] current_interval = intervals[0];
        result_arr.add(current_interval);

        for (int[] interval : intervals) {
            // int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            }else{
                current_interval = interval;
                result_arr.add(current_interval);
            }
        }

        return result_arr.toArray(new int[result_arr.size()][]);
    }
}


//output
//[1, 6][8, 10][15, 18]