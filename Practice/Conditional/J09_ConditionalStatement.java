package Conditional;

import java.util.Scanner;

public class J09_ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        }
        sc.close();
    }
}
