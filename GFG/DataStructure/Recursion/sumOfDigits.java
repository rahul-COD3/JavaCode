package GFG.DataStructure.Recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your N value: ");
        int n = sc.nextInt();
        System.out.println(fun(n));
        sc.close();
    }

    static int fun(int n) {
        if (n < 10) {
            return n;
        }
        return fun(n / 10) + n % 10;
    }
}
