package interviewBit;

import java.util.ArrayList;

public class KthrowOfPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		ArrayList<Integer> res = solve(num);
		System.out.println(res);
	}

	public static ArrayList<Integer> solve(int num) {
		ArrayList<Integer> res = new ArrayList<>();
		for (int line = 1; line <= num + 1; line++) {
			int C = 1;
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 1; i <= line; i++) {
				al.add(C);
				C = C * (line - i) / i;
			}
			if (line == num + 1)
				res = al;
		}

		return res;
	}

}
