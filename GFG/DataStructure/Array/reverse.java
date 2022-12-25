package GFG.DataStructure.Array;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 45, 48, 76, 90 };
        rev(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rev(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
