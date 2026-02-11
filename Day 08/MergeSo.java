// package Day 08;

public class MergeSo {
    static class Node{
            int data;
            Node prev;
            Node next;
            Node(int d){
                this.data = d;
                this.next = null;
            }
        }
        static Node findMid(Node head){
            if(head == null || head.next!= null) return head;
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        static void mergeSo(Node head){
            if(head ==null || head.next == null)return;
            Node mid = findMid(head);
            Node right = mid.next;
            mid.next = null;
            mergeSo(head);
            mergeSo(right);
            merge(head, right);
        }
        static Node merge(Node l1,Node l2){
            Node 13 = new Node(-1);
            Node temp =13;
            while(l1!= null && l2 != null){
                if(l1.data <=l2.data){
                    temp.next = new Node(l1.data);
                    l1=l1.next;
                }else{
                    temp.next = new Node(l2.data);
                    l2 = l2.next;
                }
                while(l1!= null){
                    temp.next = new Node(l2.data);

                }
            }
            static Node addElement(Node head, int d){
                Node newNode = new Node(d);
                
            }
        }

    public static void main(String[] args) {
        
    }
}
