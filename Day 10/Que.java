// package Day 10;
/* adt ,     thread - shaped thatswhy slow in nature . 
rear pointer - tail
front p - head 

*/

// you are given with a number and u have k chances to remove the digits and get a smallest answer. 
// leading zeroes.


import java.util.*;
public class Que {
    static Stack<Integer> st = new Stack<>();
    // static String 
    public static void main(String[] args) {
        // String s = "1242192";
        String s = "0123456000";
        int k = 2;
        Deque<Character> st = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            while(!st.isEmpty() && st.peek()>c && k>0){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k-->0) st.pop();
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        // for leaidng zeroes
        // int i =0;
        sb = sb.reverse();
        while(sb.charAt(0) =='0'){
            // for(int i =0;i<sb.length();i++){
            //     if(sb.charAt(i)=='0')sb.deleteCharAt(i);
            sb.deleteCharAt(0);
            // i++;
            }
        
        System.out.println(sb.reverse().toString());

        
    }
}
