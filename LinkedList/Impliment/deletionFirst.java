package LinkedList.Impliment;

import java.util.Scanner;

public class deletionFirst {
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

    public void delHead() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deletionFirst llList = new deletionFirst();
        int n = sc.nextInt();
        while (n > 0) {
            int data = sc.nextInt();
            llList.addLast(data);
            n--;
        }
        int delValue = sc.nextInt();
        while (delValue > 0) {
            llList.delHead();
            delValue--;
        }
        llList.printList();
        sc.close();
    }
}
