package Opps_Programming.classes;

class Main {
    int x = 10;
}

public class class1 {
    public static void main(String[] args) {
        Main myObj1 = new Main(); // Object 1
        Main myObj2 = new Main(); // Object 2
        myObj1.x = 30;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }

}
