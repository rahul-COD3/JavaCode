package LinkedList.Impliment;

import java.util.Scanner;

public class insertInAnyPos {
    /**
     * Insert Node at any position
     */
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNth(int data, int position) {
        // create new node.
        Node node = new Node(data);

        if (this.head == null) {
            // if head is null and position is zero then exit.
            if (position != 0) {
                return;
            } else { // node set to the head.
                this.head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;
    }

    public Node insertPos(int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            head = temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print("->");
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        insertInAnyPos list = new insertInAnyPos();
        while (n > 0) {
            int pos = sc.nextInt();
            int data = sc.nextInt();
            list.insertPos(pos, data);
            n--;
        }
        list.printList();

        sc.close();
    }
}
