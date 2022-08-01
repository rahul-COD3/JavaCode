package Collection.Iteration;

import java.util.Arrays;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 31, 40, 50, 60);
        al.stream()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        al.stream()
                .filter(x -> x > 10)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
    }
}
