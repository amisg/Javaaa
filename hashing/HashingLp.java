package hashing;



public class HashingLp {
    int hashTable[];
    int size;
    HashingLp(int size){
        this.size = size;
        hashTable = new int[size];
    }

    int hashFunc(int num){
        return num%size;
    }

    void add(int num){
        int index = hashFunc(num);
        boolean isInserted = false;
        for (int i = 0; i < size; i++) {
            // int newIndex = (i+index)%size;
            int newIndex = (int)(Math.pow(2, i)+index)%size;
            if (hashTable[newIndex]==0) {
                hashTable[newIndex]=num;
                isInserted = true;
                break;
            }
        }
        if(isInserted){
            System.out.println(num+" is inserted successfuly");
        }else{
            System.out.println(num+" is not inserted, hastable is full");
        }
    }

    void check(int num){
        int index = hashFunc(num);
        boolean isPresent = false;
        for (int i = 0; i < size; i++) {
          //  int newIndex = (i+index)%size;
            int newIndex = (int)(Math.pow(2, i)+index)%size;
            if(hashTable[newIndex]==0){
                break;
            }else if (hashTable[newIndex]==num) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            System.out.println(num+" is present");
        }else{
            System.out.println(num+" is not present");
        }
    }

    public static void main(String[] args) {
        HashingLp h = new HashingLp(9);
        int nums[] = {8,7,13,4,9};
        for (int num : nums) {
            h.add(num);
        }
      //  System.out.println(Arrays.toString(nums));
        h.check(7);
        h.check(99);
    }
}
// longest sub array with equal 0s and 1s

// count no of sub array with sum k

// find largest /smallest sub array with sum k


// Selva
// just now
// FirstNonRepeatingCharacterInAString


// https://leetcode.com/problems/happy-number/