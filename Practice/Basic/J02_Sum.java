import java.util.Scanner;
public class J02_Sum {
    public static void main(String[] args) {
        System.out.println("Enter number 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of these number " + sum);
        sc.close();
    }
}
