package Basic;

import java.util.Scanner;

public class J06_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("Multiplication of these two number");
        System.out.println(mul);
        sc.close();
    }
}
