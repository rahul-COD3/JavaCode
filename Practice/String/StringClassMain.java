package Practice.String;

public class StringClassMain {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String s1 = "Hello";
        String s2 = new String("Hello");
        if (s == s1) {
            System.out.println("s and s1 are equal");
        } else {
            System.out.println("s and s1 are not equal");
        }
        if (s.equals(s2)) {
            System.out.println("s and s2 are equal");
        } else {
            System.out.println("s and s2 are not equal");
        }
        // contains function is used to check whether the string contains the given
        // substring or not
        if (s.contains("Hello")) {
            System.out.println("s contains Hello");
        } else {
            System.out.println("s does not contain Hello");
        }
        // startsWith function is used to check whether the string starts with the given
        // substring or not
        if (s.startsWith("hello")) {
            System.out.println("s starts with Hello");
        } else {
            System.out.println("s does not start with Hello");
        }
        // endsWith function is used to check whether the string ends with the given
        // substring or not
        if (s.endsWith("World")) {
            System.out.println("s ends with World");
        } else {
            System.out.println("s does not end with World");
        }
        // compareTo function is used to compare two strings lexicographically
        // if the string is equal to the given string then it returns 0
        // if the string is greater than the given string then it returns positive value
        // if the string is less than the given string then it returns negative value
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(s2));
        // indexOf function is used to find the index of the given substring
        // if the substring is not present in the string then it returns -1
        System.out.println(s.indexOf("llo"));
    }
}
