// package Day 11;
import java.util.*;
public class Que3 {

    /*/
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x){
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> t = q1;
        q1=q2;
        q2 = t;
    }
    public void pop(){
        if(q1.isEmpty())
            return;
        q1.remove();
    }
    public int top(){
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }
    public int size() {
        return q1.size();
    }
        */


    static void push(Deque<Integer> que, int d){
        que.offer(d);
    }
    static int pop(Deque<Integer> que){
        int n = que.size();
        for(int i =0;i<n-1;i++){
            que.offer(que.poll());
        }
        return que.poll();
    }
    public static void main(String[] args){
        Deque<Integer> que = new ArrayDeque<>();
        push(que, 10);
        push(que,20);
        push(que, 0);
        push(que, 40);
        push(que, 50);

        System.out.println(pop(que));
        System.out.println(pop(que));
        push(que, 60);
        System.out.println(pop(que));

    }
}
