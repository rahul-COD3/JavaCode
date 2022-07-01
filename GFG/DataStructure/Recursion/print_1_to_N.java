package GFG.DataStructure.Recursion;

public class print_1_to_N {
    public static void main(String[] args) {
        rec1(10, 1);
    }

    // Non tail recursion
    static void rec(int n) {
        if (n == 0) {
            return;
        }
        rec(n - 1);
        System.out.print(n + " ");
    }

    // Tail recursion =>> After execution of child class parent class is nothing
    // have to do
    // This takes less time less time on modern compilers because it is tail
    // recursive
    static void rec1(int n, int k) {
        if (n == 0) {
            return;
        }
        System.out.print(k + " ");
        rec1(n - 1, k + 1);

    }
}
