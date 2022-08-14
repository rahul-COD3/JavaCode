package LinkedList;

import java.util.LinkedList;

public class FirstLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(2, 20);
        list.addLast(30);
        // list.addFirst(10);
        System.out.println(list.get(0));
        // System.out.println(list);
    }
}
