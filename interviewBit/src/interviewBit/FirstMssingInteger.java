package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMssingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-5));
		System.out.println(solve(al));
	}

	private static int solve(ArrayList<Integer> al) {
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) < 1)
				al.set(i, Integer.MAX_VALUE);
		}
		for (int i = 0; i < al.size(); i++) {
			int ind = Math.abs(al.get(i))-1;
			if (ind < al.size()) {
				al.set(ind, -al.get(ind));
			}
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) > 0)
				return i + 1;
		}
		return al.size()+1;
	}

}
