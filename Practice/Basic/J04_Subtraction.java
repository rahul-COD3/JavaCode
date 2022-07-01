package Practice.Basic;

import java.util.Scanner;

public class J04_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your secound number: ");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Subtraction of these number: ");
        System.out.println(sub);
        sc.close();

    }
}
