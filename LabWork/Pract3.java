
import java.util.Scanner;

public class Pract3 {
    public static void main(String[] args) {
        System.out.println("Enter your meter value: ");
        Scanner in = new Scanner(System.in);
        double meter = in.nextDouble();
        double Feet = meter * 3.28084;
        System.out.println("Your feet value is: " + Feet);
        in.close();
    }
}
