package interviewBit;

public class flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 1, 1, 1, 0, 0, 1, 0 };
		int cstart = 1;
		int cend = 1;
		int fstart=1;
		int fend=1;
		int fsum = 0;
		int csum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				csum = Math.max(csum, csum + 1);
			else {
				csum = Math.max(csum, csum - 1);
			}
			
			if(csum>fsum) {
				fsum=csum;
				fend=i+1;
			}
			
		}
	}

}
