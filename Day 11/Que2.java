// package Day 11;
import java.util.*;
public class Que2 {
    
    static void reversek(Deque<Integer> que, int k){
        if(k==1 || k > que.size()) return;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<k;i++){
            st.push(que.poll());
        }
        while(!st.isEmpty()){
            que.offer(st.pop());
        }
        int s = que.size()-k;
        for(int i = 0;i<s;i++){
            que.offer(que.poll());
        }
    }
    public static void main(String[] args){
        Deque<Integer> que = new ArrayDeque<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);
        que.offer(50);
        System.out.println(que);
        reversek(que, 3);
        System.out.println(que);

        // for(int i : que){
        //     System.out.println(i);
        // }
    }
}
