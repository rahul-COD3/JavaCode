package Practice.Basic;

import java.util.Scanner;

public class J05_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter your second number: ");
        float b = sc.nextFloat();
        float Div = a / b;
        System.out.println("Division of these two number: ");
        System.out.println(Div);
        sc.close();
    }
}
