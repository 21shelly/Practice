package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookingPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2,3));
		ArrayList<Integer> dept = new ArrayList<>(Arrays.asList(2, 3,4));
		int k = 1;
		System.out.println(solve(arr, dept, k));
	}

	private static int solve(ArrayList<Integer> arr, ArrayList<Integer> dept, int k) {
		Collections.sort(arr);
		Collections.sort(dept);

		int i = 0, j = 0;
		int count = 0;
		while (i < arr.size() && j < dept.size()) {
			if (arr.get(i) <= dept.get(j)) {
				count++;
				i++;
			} else {
				count--;
				j++;
			}
			if (count > k)
				return 0;
		}
		return 1;
	}
}
