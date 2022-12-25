package GFG.BasicMath;

public class PlindromeNo {
    public static void main(String[] args) {
        System.out.println(revNo(1));
    }

    // static boolean isPalindrome(int n) {
    // if (n == Integer.parseInt(revString(Integer.toString(n)))) {
    // return true;
    // } else {
    // return false;
    // }

    // }

    // static String revString(String str) {
    // if (str.length() == 1) {
    // return str;
    // }
    // String revStr = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // revStr += str.charAt(i);
    // }
    // return revStr;
    // }

    static boolean revNo(int n) {
        int rev = 0;
        int rN = n;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = 10;
        }
        System.out.println(rev);
        if (rev == rN) {
            return true;
        } else {
            return false;
        }

    }
}
