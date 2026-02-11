// Implement postfix expresion using stack : [2 4 * 3 + 5 /]

import java.util.*;
public class PostFix {
    static Stack<Integer> st = new Stack<>();
    static int implement(String s){
        int n = s.length();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }else{
                int b = st.pop();
                int a = st.pop();

                if(c == '+'){
                    st.push(a+b);
                }
                else if(c == '-'){
                    st.push(a-b);
                }
                else if(c == '*'){
                    st.push(a*b);
                }
                else if(c == '/'){
                    st.push(a/b);
                }
                else{
                    st.push(a%b);
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args){
        String s = "24*3+5/";
        int res = implement(s);
        System.out.println(res);
    }
}
