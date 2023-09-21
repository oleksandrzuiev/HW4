// Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
// Note: There are no duplicates in the list.
// Examples: 
// Input: arr[] = {1, 2, 3, 4,5  6,  8, 9, 10}, N = 8
// Output: 5
// Explanation: The missing number between 1 to 8 is 5
// Input: arr[] = {1, 2, 3, 5}, N = 5
// Output: 7
// Explanation: The missing number between 1 to 5 is 4

public class MissingNumberApproach1 {

	static int getMissingNo(int a[], int n) {
		int total = 1;
		for (int i = 2; i <= (n + 1); i++) {
			total += i;
			total -= a[i - 2];
		}
		return total;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 5 };
		int N = arr.length;
	
		System.out.println(getMissingNo(arr, N));
	}
}

