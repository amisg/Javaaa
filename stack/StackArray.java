package stack;

public class StackArray {
    int arr[];
    int size;
    int top = -1;
    StackArray(int size){
        this.size = size;
        arr = new int[size];
    }

    void push(int num){
        if (top+1<size) {
            top++;
            arr[top] = num;
        }else{
            System.out.println("Stack is full");
        }
    }

    void pop(){
        if (top==-1) {
            System.out.println("Stack is empty");
        }else{
            System.out.println("removing value "+arr[top]);
            top--;
        }
    }

    void peek(){
        if (top==-1) {
            System.out.println("Stack is empty");
        }else{
            System.out.println(arr[top]);
        }
    }
    public static void main(String[] args) {
        StackArray st = new StackArray(4);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        st.pop();
        st.pop();
        st.peek();
    }
}
