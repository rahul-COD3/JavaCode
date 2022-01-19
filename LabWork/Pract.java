
public class Pract {
    public static void main(String[] args) {
        int x = 20, y = 50;
        if (y != 0) {
            x = y;
            y = x % y;
        }
        System.out.println(x);
    }
}
