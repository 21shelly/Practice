package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 3, 3, 2, 5 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		solve(A);
	}

	private static void solve(ArrayList<Integer> A) {
		int xor = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			xor ^= A.get(i);
		}
		for (int i = 1; i <= A.size(); i++) {
			xor ^= i;
		}

		int SBN = xor & ~(xor - 1);
		int x = 0;
		int y = 0;
		for (int i = 0; i < A.size(); i++) {
			if ((A.get(i) & SBN) != 0) {
				x ^= A.get(i);
			} else {
				y ^= A.get(i);
			}
		}
		for (int i = 1; i <= A.size(); i++) {
			if ((i & SBN) != 0) {
				x ^= i;
			} else {
				y ^= i;
			}
		}
		boolean flag = false;
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == x) {
				res.add(0, x);
				flag = !flag;
				break;
			}
		}
		if (flag == true) {
			res.add(1, y);
		} else {
			for (int i = 0; i < A.size(); i++) {
				if (A.get(i) == y) {
					res.add(0, y);
					flag = !flag;
					break;
				}
			}
			res.add(1, x);
		}
		return ;
	}
}
