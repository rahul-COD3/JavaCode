package Practice.Basic;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 8, b = 4;
        int c = a * b - a / b * 2 + 34;
        /* this operation is follow BODMAS rules */
        System.out.println("The value of c is: " + c);
        int afterPlus = a++;
        int beforePlus = ++a;
        int u = a;
        System.out.println(afterPlus + " " + beforePlus);
        System.out.println(u);

    }
}
