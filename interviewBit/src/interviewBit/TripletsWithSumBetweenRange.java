package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TripletsWithSumBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>(Arrays.asList("0.6", "0.7", "1.5", "0.8", "0.4"));
		System.out.println(solve(al));
	}

	public static int solve(ArrayList<String> A) {

		Collections.sort(A);
		for (int i = 0; i < A.size(); i++) {
			int l = i + 1;
			int r = A.size() - 1;
			while (l < r) {
				Double num = Double.parseDouble(A.get(i)) + Double.parseDouble(A.get(l)) + Double.parseDouble(A.get(r));
				if (num > 1.0 && num < 2.0) {
					return 1;
				} else if (num < 1) {
					l++;
				} else {
					r--;
				}
			}
		}
		return 0;
	}
}
