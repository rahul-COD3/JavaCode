package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
// import java.util.Stack;

/**
 * usingStackClass
 */
public class usingStackClass {

    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        System.out.println("Enter your size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            s.push(temp);
        }
        for (Integer e : s) {
            System.out.print(e + " ");
        }
        sc.close();

    }
}