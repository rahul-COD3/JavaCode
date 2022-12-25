package Practice.Loop;

public class starloop {

    public static void main(String[] args) {
        int row, col, space;
        for (row = 1; row <= 5; row++) {
            for (space = 5; space > (row); space--) {
                System.out.print("  ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}