package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaqximumUnsortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6, 7));
		System.out.println(solve(arr));
	}

	private static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> original = new ArrayList<Integer>(A);
		Collections.sort(A);
		int start = -1;
		int end = -1;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) != original.get(i)) {
				start = i;
				break;
			}
		}
		for (int i = A.size() - 1; i >= 0; i--) {
			if (A.get(i) != original.get(i)) {
				end = i;
				break;
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (start != -1 && end != -1) {
			result.add(start);
			if (start != end)
				result.add(end);
		} else
			result.add(-1);
		return result;
	}

}
