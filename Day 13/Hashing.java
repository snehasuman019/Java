// package Day 13;
import java.util.*;
public class Hashing {
    static class Node{
        String key;
        String value;
        Node next;
        Node(String f, String l){
            this.key = f;
            this.value = l;

        }
    }
    static int capacity = 5; 
    static Node[] table = new Node[capacity];
    static int hash(String key){
        int idx = Math.abs(key.hashCode()) % capacity;
        return idx;
    }
    static void put(String k, String v){
        int idx = hash(k);
        Node head = table[idx];
        while(head!=null){
            if(head.key.equals(k)){
                head.value = v;
                return;
            }
            head = head.next;
        }
        Node newNode = new Node(k,v);
        newNode.next = table[idx];
        table[idx] = newNode;

    }
    static String get(String k){
        int idx = hash(k);
        Node head = table[idx];
        while(head!=null){
            if(head.key.equals(k))
                return head.value;
            head = head.next;

        }
        return null;
    }
    public static void main(String[] args) {
       put("Sneha", "Suman");
       put("Gurleen","Kaur");
       put("Himani","Dhull");
       put("Aditya","Soni");
       put("abc","xyz");

        String res = get("Sneha");
        System.out.println("Sneha : " + hash("Sneha"));
        System.out.println("Gurleen : " + hash("Gurleen"));
    }
}
