import java.util.Scanner;

public class AddSub {
    public static void main(String[] args) {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n value:");
        int n = sc.nextInt();
        for (double i = 1; i <= n; i++) {
            double an = 1 / i;
            if (i % 2 == 0) {
                result -= an;
            } else {
                result += an;
            }

        }
        System.out.println("your result is " + result);
        sc.close();

    }
}
