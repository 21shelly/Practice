package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class nBy3RepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1));
		System.out.println(solve(al));
	}

	private static int solve(ArrayList<Integer> al) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < al.size(); i++) {
			if (first == al.get(i)) {
				count1++;
			} else if (second == al.get(i)) {
				count2++;
			} else if (count1 == 0) {
				first = al.get(i);
				count1++;
			} else if (count2 == 0) {
				second = al.get(i);
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == first)
				count1++;
			else if (al.get(i) == second)
				count2++;
		}
		if (count1 > al.size() / 3)
			return first;
		if (count2 > al.size() / 3)
			return second;

		return -1;
	}

}
