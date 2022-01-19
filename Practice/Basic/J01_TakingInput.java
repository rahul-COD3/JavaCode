package Basic;

import java.util.Scanner;

public class J01_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user side: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);
        boolean a1 = sc.hasNext();
        System.out.println(a1);
        java.lang.String st = sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}
