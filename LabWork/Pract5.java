
import java.util.Scanner;

public class Pract5 {
    /*
     * Write a program that prompts the user to enter three integers and display the
     * integers in decreasing order
     */
    public static void main(String[] args) {
        System.out.println("Enter your 3 interges: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        System.out.println("\nYour result is");
        if (n1 > n2 && n1 > n3) {
            System.out.println("\nYour result is");
            System.out.println(n1);
            if (n2 > n3) {
                System.out.println(n2 + "\n" + n3);
            } else {
                System.out.println(n3 + "\n" + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
            if (n1 > n3) {
                System.out.println(n1 + "\n" + n3);
            } else {
                System.out.println(n3 + "\n" + n1);
            }
        }
        if (n3 > n2 && n3 > n1) {
            System.out.println(n3);
            if (n2 > n1) {
                System.out.println(n2 + "\n" + n1);
            } else {
                System.out.println(n1 + "\n" + n2);
            }
        }
    }
}
