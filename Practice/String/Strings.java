class Strings {
    public static void main(String[] args) {

        // Initialization of String.
        String s = "Good Morning";

        // Printing of String.
        System.out.println(s);

        // char charAt(int index)
        System.out.println(s.charAt(0));

        // int lenght()
        System.out.println(s.length());

        // String substring(int beginIndex)
        System.out.println(s.substring(5));

        // String substring(int beginIndex, int endIndex)
        System.out.println(s.substring(5, 8));

        // boolean contains(CharSequence s)
        System.out.println(s.contains("Good"));


    }
}