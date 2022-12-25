package LinkedList;

// [nth node from last & delete nth node]; 

public class nthNodeFromLast {

    public static void main(String[] args) {

        Node1 head = new Node1(10);
        Node1 temp1 = new Node1(20);
        Node1 temp2 = new Node1(30);
        Node1 temp3 = new Node1(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null;
        System.out.println(head.val);
    }
}

class Node1 {
    int val;
    Node1 next;

    Node1(int val) {
        this.val = val;
        this.next = null;
    }
}
