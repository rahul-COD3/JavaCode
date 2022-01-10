package GFG.DataStructure.Array;

public class insert {
    public static void main(String[] args) {
        int cap = 6;
        int[] arr = new int[cap];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int n = 5;
        int x = 3;
        int pos = 3;

        Insert(arr, n, x, cap, pos);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int Insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        }
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];

        }
        arr[idx] = x;
        return (n + 1);
    }
}