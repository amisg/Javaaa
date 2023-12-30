package searching;

public class LinearSearch {

    public static int linearSearch(int arr[],int target){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,6,3};
        System.out.println(linearSearch(arr, 3));
    }
}
