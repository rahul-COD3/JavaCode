package GFG.DataStructure.Recursion;

public class recursion_practice {
    public static void main(String[] args) {
        rec(10);

    }

    static int rec(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            System.out.println(n);
            return rec(n - 1);
        }
    }
}
