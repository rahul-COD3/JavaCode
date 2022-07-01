package GFG.DataStructure.Recursion;

public class practice_2 {
    public static void main(String[] args) {
        System.out.println(rec(16));
    }

    static int rec(int n) {

        
        if (n == 1) {
            return 0;
        } else {
            return 1 + rec(n / 2);
        }
    }
}
