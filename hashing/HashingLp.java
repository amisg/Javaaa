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
            int newIndex = (i+index)%size;
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
            int newIndex = (i+index)%size;
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
        h.check(7);
    }
}
