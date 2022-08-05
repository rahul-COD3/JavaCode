package LinkedList;

public class reverseUsingRec {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node recRerl(Node head) {
        if (head == null)
            return head;
        if (head.next == null)
            return head;
        Node rest_head = recRerl(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    Node recRevL(Node curr, Node prev) {
        if (curr == null)
            return prev;
        Node next = curr.next;
        curr.next = prev;
        return recRevL(next, prev);
    }

    // remove dublicate value in LL
    Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}
