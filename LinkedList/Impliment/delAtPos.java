package LinkedList.Impliment;

import java.util.Scanner;

public class delAtPos {

    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            this.next = null;
            this.data = x;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
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

    public void delHead(int position) {
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        delAtPos llList = new delAtPos();
        int n = sc.nextInt();
        while (n > 0) {
            int data = sc.nextInt();
            llList.addLast(data);
            n--;
        }
        int delpos = sc.nextInt();

        llList.delHead(delpos);

        llList.printList();
        sc.close();
    }
}
