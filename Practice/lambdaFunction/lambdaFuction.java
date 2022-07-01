package Practice.lambdaFunction;

/**
 * lambdaFuction
 */
interface Test1 {
    void print();
}

/**
 * rahul
 */
class rahul {

    static void fun(Test1 t) {
        t.print();
    }

    public static void main(String[] args) {
        fun(() -> System.out.println("Hello"));

    }
}