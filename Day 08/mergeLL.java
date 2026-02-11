public class mergeLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }
    (Node L1, Node L2);
    Node temp1 = l1;
    Node temp2 = l2;
    Node l3 = new Node(0);
    Node temp3= l3;

    while(temp1!=null && temp2!= null){
        if(temp.data<=temp2.data){
            temp3.next = new Node(temp1.data);
            temp.next.prev = temp3;
            temp3 = temp3.next;
            temp1=temp1.next;
        }else{
            emp3.next = new Node(temp2.data);
            temp.next.prev = temp3;
            temp3 = temp3.next;
            temp2=temp2.next;
        }
    if(temp1!=null){
            temp3.next = temp1;
            temp1.prev = temp3;
      
    else if(temp2!=null){
        temp3.next = temp2;
        temp2.prev = temp3;
      }
      return l3.next;
    }
    public static void main(String[] args){

    }
}
}
