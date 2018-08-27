package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		al.add(new ArrayList<>(Arrays.asList(0,0)));
		al.add(new ArrayList<>(Arrays.asList(1, 0)));
	//	al.add(new ArrayList<>(Arrays.asList(1, 1)));

		solve(al);
	}

	private static void solve(ArrayList<ArrayList<Integer>> al) {
		int[][] mat = new int[al.size()][al.get(0).size()];
		for (int i = 0; i < al.size(); i++) {
			ArrayList<Integer> a = al.get(i);
			for (int j = 0; j < a.size(); j++) {
				mat[i][j] = a.get(j);
			}
		}

		boolean rowFlag = false;
		boolean colFlag = false;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == 0 && mat[i][j] == 0) {
					rowFlag = true;
				}
				if (j == 0 && mat[i][j] == 0) {
					colFlag = true;
				}
				if (mat[i][j] == 0) {
					mat[0][j] = 0;
					mat[i][0] = 0;
				}
			}
		}

		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				if (mat[0][j] == 0 || mat[i][0] == 0) {
					mat[i][j] = 0;
				}
			}
		}

		if (rowFlag == true) {
			for (int i = 0; i < mat[0].length; i++) {
				mat[0][i] = 0;
			}
		}

		if (colFlag == true) {
			for (int i = 0; i < mat.length; i++) {
				mat[i][0] = 0;
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[");
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print("]");
		}

	}

}
