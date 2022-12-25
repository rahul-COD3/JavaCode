package LinkedList.PracticeOnNode;

public class LListClass {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    void AddFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    void delFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void delLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    void printList() {
        if (head == null) {
            System.out.println("Nothing in the list");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "\t");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LListClass list = new LListClass();
        list.addLast(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printList();
        list.AddFirst(5);
        list.printList();
        list.delLast();
        list.delFirst();
        list.printList();
    }
}
