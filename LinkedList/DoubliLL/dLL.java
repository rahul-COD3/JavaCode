package LinkedList.DoubliLL;

class dLL {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    void insertFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
    }

    void insetLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print(" --> ");
            }
            currNode = currNode.next;
        }
    }

    void revList() {
        if (head == null || head.next == null) {
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = curr.prev;
            curr = curr.prev;
        }
        head = prev.prev;
    }

    public static void main(String[] args) {
        dLL list = new dLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insetLast(40);
        list.insetLast(50);
        list.insetLast(60);
        list.printList();
    }
}
