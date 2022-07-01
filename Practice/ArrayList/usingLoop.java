package Practice.ArrayList;

import java.util.ArrayList;

public class usingLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // using for loop

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }

        // using for each-loop
        System.out.println();
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
