package Practice.bigIntegers;

import java.math.BigInteger;

public class initialization {
    public static void main(String[] args) {

        // direct Initialization
        BigInteger A = new BigInteger("54");
        System.out.println(A);

        // string to BigInteger
        String b = "3423432";
        BigInteger B = new BigInteger(b);

        // int to bigIntegers
        long c = 348939;
        BigInteger C = BigInteger.valueOf(c);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        // Additon of Big integers

        BigInteger total = C.add(B);
        System.out.println(total);

        // subtraction of Big integers

        BigInteger total1 = C.subtract(B);
        System.out.println(total1);

        // Multiplication of Big integers

        BigInteger total2 = C.multiply(B);
        System.out.println(total2);

        // Division of Big integers

        BigInteger total3 = C.divide(B);
        System.out.println(total3);

    }
}
