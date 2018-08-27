package interviewBit;

public class MaximumAbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -70, -64, -6, -56, 64, 61, -57, 16, 48, -98 };
		System.out.println(solve(arr));
	}

	private static int solve(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max1 = Math.max(max1, arr[i] + i);
			max2 = Math.max(max2, arr[i] - i);
			min1 = Math.min(min1, arr[i] + i);
			min2 = Math.min(min2, arr[i] - i);

		}

		return Math.max(max2 - min2, max1 - min1);
	}

}
