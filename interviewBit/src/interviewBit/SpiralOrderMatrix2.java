package interviewBit;

import java.util.ArrayList;

public class SpiralOrderMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		ArrayList<ArrayList<Integer>> res = solve(num);
		System.out.println(res);

	}

	public static ArrayList<ArrayList<Integer>> solve(int num) {
		int[][] arr = new int[num][num];
		int rowmin = 0, colmin = 0, rowmax = arr.length - 1, colmax = arr.length - 1;
		int count = 1;
		int total = num * num;
		while (count <= total) {
			for (int i = colmin; i <= colmax; i++) {
				arr[rowmin][i] = count;
				count++;
			}
			rowmin++;
			for (int i = rowmin; i <= rowmax; i++) {
				arr[i][colmax] = count;
				count++;
			}
			colmax--;
			for (int i = colmax; i >= colmin; i--) {
				arr[rowmax][i] = count;
				count++;
			}
			rowmax--;
			for (int i = rowmax; i >= rowmin; i--) {
				arr[i][colmin] = count;
				count++;
			}
			colmin++;
		}

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> al = new ArrayList<>();
			for (int j = 0; j < arr.length; j++) {
				al.add(arr[i][j]);
			}
			res.add(al);
		}
		return res;
	}
}
