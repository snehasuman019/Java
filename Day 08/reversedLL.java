
public class reversedLL {

    static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }
    }

    static Node add(Node head, int d) {
        Node newNode = new Node(d);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node reverse(Node head) {
        Node temp = null;
        Node curr = head;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null)
            head = temp.prev;

        return head;
    }

    public static void main(String[] args) {

        Node head = null;
        head = add(head, 10);
        head = add(head, 20);
        head = add(head, 30);
        head = add(head, 40);

        System.out.println("Original:");
        print(head);

        head = reverse(head);

        System.out.println("Reversed:");
        print(head);
    }
}
