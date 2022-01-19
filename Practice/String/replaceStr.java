package String;

public class replaceStr {
    public static void main(String[] args) {
        String frdName = " Vipul, Divyanshu, Vinay, Rahul, Bunty, Aditya, Alock";

        // replacing space to non space
        String Allfrd = frdName.replace(" ", "");

        // storing array through , comma syntax
        String listfrd[] = Allfrd.split(",");

        for (String f : listfrd) {
            System.out.println(f);
        }

    }
}
