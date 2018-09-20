package interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52));
		solve(al);
		System.out.println(al);
	}

	private static void solve(ArrayList<Integer> al) {
		int i=al.size()-1;
		int dipInd=-1;
		while(i>0) {
			if(al.get(i-1)<al.get(i)) {
				dipInd=i-1;
				break;
			}
			i--;
		}
		i=al.size()-1;
		while(dipInd!=-1&&i>=0) {
			if(al.get(i)>al.get(dipInd)) {
				int temp=al.get(dipInd);
				al.set(dipInd, al.get(i));
				al.set(i,temp);
				break;
			}
			i--;
		}
		
		i=dipInd+1;
		int j=al.size()-1;
		while(i<j) {
			int temp=al.get(i);
			al.set(i, al.get(j));
			al.set(j,temp);
			i++;
			j--;
		}
	}

}
