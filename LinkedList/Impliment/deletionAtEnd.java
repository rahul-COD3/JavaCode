package LinkedList.Impliment;

import java.util.Scanner;

public class deletionAtEnd {
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

    public void delLast() {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deletionAtEnd list = new deletionAtEnd();
        int n = sc.nextInt();
        while (n > 0) {
            int data = sc.nextInt();
            list.addLast(data);
            n--;
        }
        int delValue = sc.nextInt();
        while (delValue > 0) {
            list.delLast();
            delValue--;
        }
        list.printList();
        sc.close();
    }
}
