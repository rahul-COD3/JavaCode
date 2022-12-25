package GFG.Java.OutPut;

public class formate {
    public static void main(String[] args) {
        int x = 100, y = 200;
        System.out.format("value of x is %d\n", x);
        double z = Math.PI;
        System.out.println(z);
        System.out.format("value of PI = %.2f\n", z);
        System.out.format("value of PI = %5.2f\n", z);
        System.out.format("value of PI = %07.2f\n", z);
        System.out.printf("x = %d, y = %d", x, y);
    }
}
