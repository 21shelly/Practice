package interviewBit;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		ArrayList<ArrayList<Integer>> res = solve(num);
		System.out.println(res);
	}

	public static ArrayList<ArrayList<Integer>> solve(int num) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (int line = 1; line <= num; line++) {
			int C = 1;
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 1; i <= line; i++) {
				al.add(C);
				C = C * (line - i) / i;
			}
			res.add(al);
		}

		return res;
	}
}
