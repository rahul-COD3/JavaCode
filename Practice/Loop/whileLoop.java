package Practice.Loop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        sc.close();
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("the sum of " + n + " is " + sum);

        int numberOfDigit = (int) Math.log10(n) + 1;
        System.out.println("the number of digit is " + numberOfDigit);
    }
}
