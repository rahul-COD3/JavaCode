package LinkedList.Impliment;

public class linkedListCreate {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        printList(head);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "\t");
            curr = curr.next;
        }
    }

    static void recPrintList(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + "\t");
        recPrintList(head.next);

    }
}

/**
 * Node
 */
class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}