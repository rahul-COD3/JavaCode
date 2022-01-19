
public class Practt11 {
    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 2);
                cnt += arr[i][j];
            }
            if (cnt % 2 == 0) {
                arr[i][5] = 1;
            } else {
                arr[i][5] = 0;
            }
        }
        System.out.println("\n\n");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
