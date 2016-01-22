package solution;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 2;
		Arrays.sort(a);
		int i = Arrays.binarySearch(a,0,1,5);
		System.out.println(i);
	}
}
