package Practice.String;

public class AdString {
    public static void main(String[] args) {
        String name = "Rahul";
        String name2 = new String("Rahul");

        System.out.println(name == name2);

        // booliean equal(Object another)
        System.out.println(name.equals(name2));

        // boolean isEmpaty()
        System.out.println(name.isEmpty());
    }
}
