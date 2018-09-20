package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		a.add(new ArrayList<>(Arrays.asList(1,2)));
		a.add(new ArrayList<>(Arrays.asList(3,4)));
	//	a.add(new ArrayList<>(Arrays.asList(7,8,9)));
		
		transpose(a);
		colExch(a);
		for(int i=0;i<a.size();i++) {
			System.out.print("[");
			for(int j=0;j<a.get(0).size();j++) {
				System.out.print(a.get(i).get(j)+" ");
			}
			System.out.print("]");
		}
	}

	private static void colExch(ArrayList<ArrayList<Integer>> a) {
		int c1 = 0, c2 = a.get(0).size() - 1;
		while (c1 <= c2) {
			for (int r = 0; r < a.size(); r++) {
				int temp = a.get(r).get(c1);
				a.get(r).set(c1, a.get(r).get(c2));
				a.get(r).set(c2, temp);
			}
			c1++;
			c2--;
		}

	}

	public static void transpose(ArrayList<ArrayList<Integer>> a) {
		int row = 0, col = 0;
		int i = 0;
		while (row < a.size()) {
			while (i < a.get(0).size()) {
				int temp = a.get(row).get(i);
				a.get(row).set(i, a.get(i).get(col));
				a.get(i).set(col, temp);
				i++;
			}
			row++;
			col++;
			i = col;
		}
	}
}
