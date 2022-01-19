package Loop;

public class Hcf {

    public static void main(String[] args) {

        int n1 = 5, n2 = 20, hcf = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }

        System.out.print(hcf);
    }
}