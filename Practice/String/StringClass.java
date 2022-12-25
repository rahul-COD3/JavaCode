package Practice.String;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Rahul";
        String s2 = "Rahul";
        if (s1 == s2) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }
        String s3 = new String("Rahul");
        if (s1 == s3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
