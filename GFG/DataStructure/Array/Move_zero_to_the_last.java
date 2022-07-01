package GFG.DataStructure.Array;

public class Move_zero_to_the_last {
    public static void main(String[] args) {
        int[] arr = { 23, 3, 423, 0, 24, 0, 32, 23, 0 };
        sol(arr);

    }

    static void sol(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
