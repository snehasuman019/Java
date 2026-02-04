
// 4_2//find pairs of a given sum in a sorted doubly LL.
// arr = [10,20,30,40,50]         target sum = 50


public class Que4_2{
    static class Node{
        int data;
        Node prev, next;
        Node(int d){
            data= d;
        }
    }
    static void findPairs(Node head, int target){
        if(head == null) return;
            Node left = head;
            Node right = head;
            while(right.next != null){
                right=right.next;
                
                
        }
        boolean found = false;
        while(left!= null && right != null && left != right && right.next != left){
            int sum = left.data + right.data;
            if(sum == target){
                System.out.println("("+left.data+", " + right.data + ")");
                found = true;
                left = left.next;
                right = right.prev;
            }
            else if (sum < target){
                left = left.next;
                
            }else{
                right = right.prev;
            }
        }
        if (!found){
            System.out.println("No pair found");
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
         head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.prev = head.next.next.next;

        findPairs(head, 50);
    
    }
}

