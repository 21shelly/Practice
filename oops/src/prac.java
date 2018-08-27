import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1,1,9, 9};
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		// A.add(0);

		ArrayList<Integer> res = plusOne(A);
		System.out.println(res);

	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int num = A.get(A.size() - 1);

		num += 1;
		int rem = num % 10;
		int carry = num / 10;
		int ptr = A.size() - 1;
		if (num > 9) {
			while (carry != 0) {
				A.set(ptr, rem);
				ptr--;

				if (ptr > -1) {
					num = rem = A.get(ptr) + 1;
					rem = rem % 10;
					carry = num / 10;
				}

			}

		} else {
			A.set(A.size() - 1, num);
		}
		if (ptr == -1 && carry == 1) {
			A.add(0, 1);
			carry = 0;
		}else {
			A.add(ptr,)
		}
		return A;
	}

}
