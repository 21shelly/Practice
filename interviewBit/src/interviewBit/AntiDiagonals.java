package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
			al.add(new ArrayList<>(Arrays.asList(1,2,3)));
			al.add(new ArrayList<>(Arrays.asList(4,5,6)));
			al.add(new ArrayList<>(Arrays.asList(7,8,9)));
		
		ArrayList<ArrayList<Integer>> res = diagonal(al);
		System.out.println(res);
	}

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> al) {
		int count = 0;
		int size = 2*al.get(0).size() - 1;
		int r = al.size() ;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		while (count < size) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i=0;i<r;i++) {
				for(int j=0;j<r;j++) {
					if(i+j==count) {
						temp.add(al.get(i).get(j));
					}
					if(i+j>count) {
						continue;
					}
				}
			}
			res.add(temp);
			count++;
		}
		return res;
	}
}
