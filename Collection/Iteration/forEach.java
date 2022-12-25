package Collection.Iteration;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 30, 40, 50, 60);
        for (Integer x : al) {
            System.out.print(x + " ");
        }
    }
}
