package String;

public class patternStringProblem {
    public static void main(String[] args) {
        patSearch("Geeks for Geeks", "Geek");
    }

    public static void patSearch(String txt, String pat) {
        int pos = txt.indexOf(pat);
        while (pos >= 0) {
            System.out.println(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }
}