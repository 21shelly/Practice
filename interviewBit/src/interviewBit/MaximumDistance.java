package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 5, 4, 2));
		System.out.println(maximumGap(arr));

	}

	public static int maximumGap(ArrayList<Integer> A) {
		int[] Min = new int[A.size()];
		int[] Max = new int[A.size()];
		Min[0] = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			Min[i] = Math.min(A.get(i), Min[i - 1]);
		}

		Max[A.size() - 1] = A.get(A.size() - 1);
		for (int i = A.size() - 2; i >= 0; i--) {
			Max[i] = Math.max(A.get(i), Max[i + 1]);
		}

		int i = 0, j = 0;
		int maxLen=1;
		while (i < Min.length && j < Max.length) {
			if(Min[i]<=Max[j]) {
				i++;
			}else {
				i++;
				j=i;
			}
			int len=i-j;
			if(len>maxLen) {
				maxLen=len;
			}
		}
		
		return maxLen;
	}
}