public class dublicateValue {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 40, 40 };
        int n = arr.length;
        System.out.println(remDups(arr, n));

    }

    static int remDups(int arr[], int n) {
        int[] temp = new int[n];

        temp[0] = arr[0];
        int res = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != temp[res - 1]) {
                temp[res] = arr[i];
                res++;
            }
        }

        // for (int i = 0; i < temp.length; i++) {
        // System.out.print(temp[i] + ", ");
        // }
        // System.out.println();

        return res;
    }
}
