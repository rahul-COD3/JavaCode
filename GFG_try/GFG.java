package GFG_try;

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int k = sc.nextInt();
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n - 1, k));
        }
        out.flush();
        sc.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];

    }
}