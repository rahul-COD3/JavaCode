package Practice.String;

public class strBuilder1 {
    public static void main(String[] args) {
        String s1 = "rahul";
        String s2 = s1;
        System.out.println(s2);
        s1 = s1 + "kumar";
        if (s1 == s2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
        StringBuilder sb1 = new StringBuilder("rahul");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("Rahul");
        if (sb1 == sb2) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
