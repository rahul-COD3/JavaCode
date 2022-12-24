package Practice.Maps;

import java.util.*;

public class DictionaryMap {
    public static void main(String[] args) {
        Map<Integer,String>m = new HashMap<>();
        m.put(1,"One");
        m.put(2,"Two");
        m.put(3,"Three");
        m.put(4,"Four");
        m.put(5,"Five");
        System.out.println(m.get(7));
//        print out all keys
        System.out.println(m.keySet());
//        print out all value
        System.out.println(m.values());
    }
}
