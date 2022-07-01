package GFG.DataStructure.Searching;

/**
 * binarySearch
 */
public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int x = 9;
        System.out.println(bSearch(arr, x));
    }

    static int bSearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}