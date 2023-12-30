package hashing;

public class Hashing {
    int hashTable[];
    int size;
    Hashing(int size){
        this.size = size;
        hashTable = new int[size];
    }

    int hashFunc(int num){
        return num%size;
    }

    void add(int num){
        int index = hashFunc(num);
        hashTable[index] = num;
    }

    void check(int num){
        int index = hashFunc(num);
        if(hashTable[index]==num){
            System.out.println(num+" is present");
        }else{
            System.out.println(num+" is not present");
        }
    }

    public static void main(String[] args) {
        Hashing h = new Hashing(5);
        int nums[] = {20,13,1,2,0};
        for(int num:nums){
            h.add(num);
        }
        h.check(20);
        h.check(13);
        h.check(2);
        h.check(1);
        h.check(0);
        h.check(3);
    }
}
