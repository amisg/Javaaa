package Array;

public class ThirdMaximum {
    public static void main(String[] args) {
        int arr[] = {12,-2,3,65,55,45};
        int firstMax = getMaximum(arr);
        arr[firstMax] = -1000000000;
        int secMax = getMaximum(arr);
        arr[secMax] = -100000000;
        int thirdMax = getMaximum(arr);
        System.out.println(arr[thirdMax]);
    }

    public static int getMaximum(int arr[]){
        int maxIndex = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[maxIndex]<arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
