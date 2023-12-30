package linkedList;

public class CLL {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    void insertAtEnd(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next!=head) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        newNode.next = head;
    }

    void print(){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.val+" ");
            curr = curr.next;
            if (curr==head) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CLL c = new CLL();
        c.insertAtEnd(0);
        c.insertAtEnd(1);
        c.insertAtEnd(2);
        c.print();
    }
}
