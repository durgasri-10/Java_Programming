import java.util.*;
public class stack{
    public static void main(String ar[]){
        Stack<Integer> st =  new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
    }
}