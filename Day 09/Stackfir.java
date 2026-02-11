
/* adt ,     thread - shaped thatswhy slow in nature . 
rear pointer - tail
front p - head 

*/

/* /functions of stack :-
// push(E item) → Adds an element to the top of the stack.
pop() → Removes and returns the top element of the stack.
peek() / top() → Returns the top element without removing it.
empty() → Checks if the stack is empty (returns true/false).
search(Object o) → Returns the 1-based position of an element from the top of the stack (or -1 if not found).
size() → Returns the number of elements in the stack.
isEmpty() → Another way to check if the stack has no elements.
contains(Object o) → Checks if a specific element exists in the stack.
elementAt(int index) → Retrieves the element at a specific index.
*/
import java.util.*;
public class Stackfir {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node top =null;

    // Node head = null;
    static void push(int d){
        Node newNode = new Node(d);
        if(top == null){
            top = newNode;

    }else{
        newNode.next = top;
        top = newNode;
    }
}
    static int pop(){
        if(top==null)return -1;
        int key = top.data;
        top = top.next;
        return key;
    }
    static void isEmpty(){
        if(top == null)
            System.out.println("Stack is empty.");
    }
    static int len(){
        if(top == null) return 0;
        int c =0;
        Node head = top;
        while(head != null){
            head = head.next;
            c++;
        }
        return c;
    }
    static ArrayList<Integer> maxmin(){
        if(top == null) return null;
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(top.data, top.data));
        Node temp = top;
        while(temp!= null){
            if(temp.data<lst.get(0)){
                lst.set(0,temp.data);
            }else if(temp.data>lst.get(1)){
                lst.set(1,temp.data);
            }
            temp = temp.next;
        }
        return lst;
    }
    static Node reverseNode(){
        Node prev = null;
        Node curr = top;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        top = prev;
        return top;
    }
    public static void main(String[] args){

    }
}
