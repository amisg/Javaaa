package oops;

public class Abstract {
    public static void main(String args[]){
      Animal a1 = new Animal();
      a1.setId(20);
      a1.getId();
    }
}

 class Animal{
    private int id;

    public int setId(int id){
       return this.id = id;
    }

    public void getId(){
        System.out.println(id);
    }
}


