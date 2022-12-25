package GFG.BasicMath;

public class countDigits {
    public static void main(String[] args) {
        System.out.println(CountDigits(22240));
    }

    static int CountDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
