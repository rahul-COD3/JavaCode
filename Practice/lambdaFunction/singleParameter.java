package Practice.lambdaFunction;

/**
 * Test2
 */
interface Test2 {

    void print(Integer P);
}

/**
 * singleParameter
 */
public class singleParameter {
    static void fun(Test2 t, Integer P) {
        t.print(P);
    }

    public static void main(String[] args) {
        fun(P -> System.out.println(P), 10);
    }
}