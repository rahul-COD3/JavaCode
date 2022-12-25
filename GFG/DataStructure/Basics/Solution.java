package GFG.DataStructure.Basics;

public class Solution {

    public static void main(String[] args) {
        int m = 9;
        int n = 11;
        int count = 0;
        int max = 0;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n));
        String a = Integer.toBinaryString(m);
        String b = Integer.toBinaryString(n);
        if (a.length() > b.length()) {
            max = a.length();
        } else {
            max = b.length();
        }
        m = Integer.parseInt(a);
        n = Integer.parseInt(b);
        for (int i = 0; i < max; i++) {
            if ((m % 10) == (n % 10)) {
                count++;
            } else {
                break;
            }

        }
        System.out.println(count);

    }
}