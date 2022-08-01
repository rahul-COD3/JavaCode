package LinkedList.Impliment;

import java.util.Scanner;

public class Lists_Searching {
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

    public void delLast(int value) {
        if (head == null) {
            System.out.println("No");
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == value) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lists_Searching list = new Lists_Searching();
        int n = sc.nextInt();
        while (n > 0) {
            int data = sc.nextInt();
            list.addLast(data);
            n--;
        }
        int delValue = sc.nextInt();
        list.delLast(delValue);

        list.printList();
        sc.close();
    }
}
