public class Solution {
    public static void main(String[] args) {
        int[] A = { 5, -2, 3, 1, 2 };
        int n = 3;
        System.out.println(solve(A, n));

    }

    static int solve(int[] A, int B) {
        int total = 0;
        for (int i = 0; i < B; i++) {
            total += Math.max(A[i], A[A.length - i - 1]);
            System.out.println(Math.max(A[i], A[A.length - i - 1]));
        }
        return total;
    }
}
