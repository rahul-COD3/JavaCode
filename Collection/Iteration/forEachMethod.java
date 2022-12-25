package Collection.Iteration;

import java.util.Arrays;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 30, 40, 50, 60);
        // al.forEach(System.out::println);
        al.forEach(x -> System.out.print(x + " "));
    }
}
