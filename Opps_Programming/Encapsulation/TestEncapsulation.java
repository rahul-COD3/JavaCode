package Opps_Programming.Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Geek");
        obj.setRoll(1);
        obj.setAge(20);

        // displaying the values of the variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Roll: " + obj.getRoll());
        System.out.println("Age: " + obj.getAge());
    }
}
