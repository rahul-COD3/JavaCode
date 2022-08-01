package LinkedList.Impliment;

import java.util.Scanner;

public class insertInAnyPos {
    /**
     * Insert Node at any position
     */
    Node head;

    public static class Node {
        int data;
        Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
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
            node.nextNode = this.head;
            this.head = node;
            return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.nextNode;

            if (current == null) {
                break;
            }

            i++;
        }

        node.nextNode = current;
        previous.nextNode = node;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.nextNode != null) {
                System.out.print("->");
            }
            currNode = currNode.nextNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        insertInAnyPos list = new insertInAnyPos();
        while (n > 0) {
            int pos = sc.nextInt();
            int data = sc.nextInt();
            list.insertNth(pos, data);
            n--;
        }
        list.printList();

        sc.close();
    }
}
