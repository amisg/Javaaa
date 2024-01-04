package stack;
import java.util.*;

public class StackBrackets {
    
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='(') {
                st.push(ch);
            }else if(ch==')'){
                if (st.isEmpty()) {
                    valid = false;
                    break;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()){
            valid = false;
        }
        return valid;
    }

    public static void main(String[] args) {
        String s = "(())";
        System.out.println(isValid(s));
        s = "())()";
        System.out.println(isValid(s));
    }
}
