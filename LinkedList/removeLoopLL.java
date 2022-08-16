package LinkedList;

class Node {
    int data;
    Node next;
}

/**
 * removeLoopLL
 */
class removeLoopLL {
    // Function to remove a loop in the linked list.
    public void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return;
        }
        int count = countNodes(fast, slow);
        slow = head;
        fast = head;
        for (int i = 1; i <= count; i++) {
            fast = fast.next;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        for (int i = 1; i < count; i++) {
            fast = fast.next;
        }
        fast.next = null;
    }

    static int countNodes(Node fast, Node slow) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            fast = fast.next;
            count++;
        }
        return count;
    }
}