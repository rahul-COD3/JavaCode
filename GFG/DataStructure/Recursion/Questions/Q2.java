package GFG.DataStructure.Recursion.Questions;

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		while (T-- > 0) {

			Solution ob = new Solution();

			String S = sc.nextLine();

			ArrayList<String> arr = ob.permutation(S, S, T);
			for (String s : arr) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		sc.close();

	}
}
// } Driver Code Ends

// User function Template for Java

class Solution {
	public ArrayList<String> permutation(String S, String curr, int index) {

		if (index == S.length()) {
			System.out.println(curr + " ");
			return null;
		}
		permutation(S, curr, index + 1);
		return permutation(S, curr + S.charAt(index), index + 1);
	}

}