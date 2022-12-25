package LinkedList;

/**
 * Nth_node_from_end_of_linked_list
 */
public class Nth_node_from_end_of_linked_list {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        int size = 0;
        Node curr = head;
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }
        int l = (size + 1) - n;
        if (l < 0) {
            return -1;
        }
        int i = 0;
        Node cur = head;
        while (i < l) {
            cur = cur.next;
            i++;
        }
        return cur.data;
    }
}
