package GFG.DataStructure.Recursion;

public class handling_baseCase {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        // hear is the base case:
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
