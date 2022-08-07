package LinkedList.CircularLinkedList;

public class traversal {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        Node r = head.next;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

}
