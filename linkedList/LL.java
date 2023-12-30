package linkedList;

public class LL {
    Node head;

    class Node{
         int val;
         Node next;
         Node(int val){
            this.val=val;
         }
    }

    void insertAtEnd(int num){
        Node newNode = new Node(num);
        if(head==null){
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next!=null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void insertAtPos(int pos,int num){
        Node newnNode = new Node(num);
        if(pos==1){
            if(head==null){
                head = newnNode;
            }else{
                newnNode.next = head;
                head = newnNode;
            }
        }else{
            Node curr = head;
            for (int i = 1; i < pos-1; i++) {
                curr = curr.next;
            }
            newnNode.next = curr.next;
            curr.next = newnNode;
        }
    }

    void deleteAtPos(int pos){
        if(pos==1){
            head = head.next;
        }else{
            Node curr = head;
            for (int i = 1; i < pos-1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }

    void print(){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printAtIndex(int index){
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        System.out.println(curr.val);
    }

    public static void main(String[] args) {
        LL li = new LL();
        li.insertAtEnd(10);
        li.print();
        li.insertAtPos(1, 3);
        li.print();
        li.insertAtPos(2, 5);
        li.print();
        li.deleteAtPos(3);
        li.print();
        li.printAtIndex(1);
    }
}
