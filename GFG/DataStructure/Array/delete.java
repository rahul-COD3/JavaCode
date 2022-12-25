package GFG.DataStructure.Array;

public class delete {
    static int Delete(int arr[], int x, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return (n - 1);
    }

}
