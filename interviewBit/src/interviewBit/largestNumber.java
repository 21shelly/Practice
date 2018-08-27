package interviewBit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 99, 999, 9999, 9998 };
		String[] tarr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tarr[i] = arr[i] + "";
		}
		System.out.println(solve(tarr));
	}

	static String solve(List<Integer> A) {
		List<String> B = new ArrayList<String>();
		for (Integer number : A) {
			String x = number.toString();
			B.add(x);
		}
		Collections.sort(B, this);
		StringBuilder ans = new StringBuilder();
		int sum = 0;
		for (int i = B.size() - 1; i >= 0; i--) {
			ans.append(B.get(i));
			sum += Integer.parseInt(B.get(i));
		}
		return sum == 0 ? "0" : ans.toString();
	}

	public int compare(String a, String b) {
		String fe = a + b;
		String se = b + a;
		return (fe.compareTo(se));
	}

}
