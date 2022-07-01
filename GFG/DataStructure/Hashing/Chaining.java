package GFG.DataStructure.Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    public static void main(String[] args) {
        myHash myHash = new myHash(7);
        myHash.insert(45);
        myHash.insert(97);
        myHash.insert(67);
        myHash.insert(56);
        myHash.insert(7);
        myHash.insert(21);
        myHash.insert(49);
        myHash.insert(67);
        System.out.println(myHash.Search(49));
        myHash.remove(49);
        System.out.println(myHash.Search(49));
    }

}

class myHash {
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    myHash(int b) {
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }

    }

    // insert function
    void insert(int key) {
        int i = key % bucket;
        table.get(i).add(key);
    }

    void remove(int key) {
        int i = key % bucket;
        table.get(i).remove((Integer) key);
    }

    boolean Search(int key) {
        int i = key % bucket;
        return table.get(i).contains(key);
    }

}
