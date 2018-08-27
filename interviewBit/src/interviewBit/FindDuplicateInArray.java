package interviewBit;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 3, 4 };
		int max = arr.length + 1;
		for (int i = 0; i < arr.length; i++) {
			int ind = (arr[i] % max) - 1;
			arr[ind] += max;
		}
		for (int i = 0; i < arr.length; i++) {
			int div = arr[i] / max;
			if (div == 2) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
