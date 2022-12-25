package Queue.usingLib;

import java.util.*;

public class probUsingQueue {
    /*
     * Problem: Given an integer N, the task is to print the first N numbers in
     * increasing order formed using digits 5 and 6.
     */
    public static void main(String[] args) {
        int N = 10;
        printFirstN(N);
    }

    static void printFirstN(int N) {
        Queue<String> q = new LinkedList<String>();
        q.add("5");
        q.add("6");
        for (int coun = 0; coun < N; coun++) {
            String curr = q.poll();
            System.out.print(curr + "\t");
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
}
