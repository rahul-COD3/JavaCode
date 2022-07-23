package LinkedList;

import java.util.LinkedList;

public class libLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> name = new LinkedList<Integer>();

        // Adding data at the end
        name.add(20);
        name.add(50);
        name.add(23);
        name.add(0, 40);
        name.add(100);
        name.add(200);
        // adding element at the end;
        name.addLast(30);
        // adding element in Start
        name.addFirst(10);
        name.remove(2);
        int cout = 0;
        for (Integer x : name) {
            System.out.print(x);
            if (cout < name.size() - 1) {
                System.out.print(" -> ");
            }
            cout++;
        }
        name.sort(null);
    }
}
