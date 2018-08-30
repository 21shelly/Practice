package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		System.out.println(solve(arr));
	}

	private static ArrayList<Integer> solve(ArrayList<Integer> arr) {
		Collections.sort(arr);
		boolean flag = false;
		for (int i = 1; i < arr.size(); i++) {
			if (flag == false) {
				if (arr.get(i - 1) < arr.get(i)) {
					Integer temp = arr.get(i);
					arr.set(i, arr.get(i - 1));
					arr.set(i - 1, temp);
				}
				flag = !flag;
			} else {
				if (arr.get(i - 1) > arr.get(i)) {
					Integer temp = arr.get(i);
					arr.set(i, arr.get(i - 1));
					arr.set(i - 1, temp);
				}
				flag = !flag;
			}
		}

		return arr;
	}

}
