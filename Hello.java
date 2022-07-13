public class Hello {
    public static void main(String[] args) {
        System.out.println("*");
    }

    public static String caesarCipher(String s, int k) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        s.toLowerCase();
        StringBuffer str = new StringBuffer(s);

        for (int i = 0; i < s.length(); i++) {
            int l = a.indexOf(s.charAt(i));
            if (s.charAt(i) == '-') {
                continue;
            } else if (l >= 25 - k + 1) {
                str.setCharAt(i, a.charAt(k - (25 - l) + 1));
            } else {
                str.setCharAt(i, a.charAt(l + k));
            }

        }
        s = str.toString();
        return s;
    }
}
