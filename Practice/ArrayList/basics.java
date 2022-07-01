package Practice.ArrayList;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("rahul");
        name.add("deepak");
        name.add("Vipul");
        name.add("rahul");
        System.out.println(name);

        System.out.println(name.get(1));
        name.set(3, "aditya");
        System.out.println(name);
        // To remove an element, use the remove() method and refer to the index number:
        name.remove("rahul");
        name.remove(2); // using index
        System.out.println(name);

        // To remove all the elements in the ArrayList, use the clear() method:

        // name.clear();
        // System.out.println(name);
        System.out.println(name.size());

    }
}