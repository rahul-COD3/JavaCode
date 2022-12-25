package LinkedList.CircularLinkedList;

/*
* CLL
*/
public class CLL {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
    }

    // Check If Circular Linked List
    boolean isCircular(Node head) {
        Node curr = head;
        while (curr.next != null) {
            if (curr.next == head) {
                return true;
            }
            curr = curr.next;
        }
        return false;

    }

    // Insert at the begining of the list
    Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    // Insert at the end of the list
    Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    // insert Node at the end efficient solution
    Node einsertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;
        return head;
    }

}