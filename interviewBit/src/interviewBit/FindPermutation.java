package interviewBit;

import java.util.ArrayList;
import java.util.Stack;

public class FindPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPerm("ID", 3));
	}

	public static ArrayList<Integer> findPerm(String str, int B) {
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int i = 0;
		while(i<=str.length()) {
			st.push(i+1);
			if(i==str.length()||str.charAt(i)=='I') {
				while(st.size()>0) {
				al.add(st.pop());
				}
			}
			i++;
		}
		
		return al;

	}

}
