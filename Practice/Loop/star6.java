public class star6 {
    public static void main(String[] args) {
        int n = 10;
        if (n == 1) {
            System.out.println("* ");
        } else {
            System.out.println("*");
            for (int i = 2; i <= n - 1; i++) {
                System.out.print("* ");
                for (int j = 0; j < i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("* ");
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
        }
    }
}