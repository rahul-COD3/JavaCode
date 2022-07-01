package Practice.ArrayList;

import java.util.ArrayList;

public class intigerType {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(20);
        n.add(30);
        n.add(10);
        n.add(34);
        n.add(3434);

        System.out.println(n);

        int total = n.get(0) + n.get(3); // arithematic operation on ArrayList Integers
        System.out.println(total);

        for (int i : n) {
            System.out.println(i);
        }

    }
}
