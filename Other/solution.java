package Other;

public class solution {
    int search(int arr[], int N, int X) {
        int low = 0, high = N - 1;
        return bSearch(arr, low, high, X);

    }

    private int bSearch(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return bSearch(arr, mid - 1, high, x);
        } else {
            return bSearch(arr, mid + 1, high, x);
        }
    }

}
