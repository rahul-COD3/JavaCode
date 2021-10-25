import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your princeple amount");
        double p = sc.nextDouble();
        System.out.println("Enter your rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter your no of year: ");
        double t = sc.nextDouble();
        double ist = (p*r*t)/100;
        System.out.println("Your interst is "+ist);
        sc.close();
    }
}
