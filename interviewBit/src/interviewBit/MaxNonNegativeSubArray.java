package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> res = solve(al);
		for (int i = 0; i < res.size(); i++)
			System.out.print(res.get(i) + " ");
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
		ArrayList<Integer> res = new ArrayList<>();
		int start = 0, end = 0, ostart = -1, oend = -1;
		Long sum = 0L, osum = 0L;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > -1) {
				end = i + 1;
				sum += arr.get(i);
			} else {
				sum = 0L;
				start = i + 1;
				end = i + 1;
			}
			if (sum > osum) {
				osum = sum;
				oend = end;
				ostart = start;
			} else if (sum == osum) {
				if (end - start > oend - ostart) {
					oend = end;
					ostart = start;
				}
			}
		}

		for (int i = ostart; i != -1 && i < oend; i++) {
			res.add(arr.get(i));
		}

		return res;
	}
}
