package LC167_TwoSum;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		TwoSum TwoSum1 = new TwoSum();
		
		int[] A1 = {-10,-5,0,3,7};
		int[] A2 = {0,2,5,8,17};
		int[] A3 = {-10,-5,3,4,7,9};
		
		int output[] = TwoSum1.TwoSum(A2,10);
		System.out.println(Arrays.toString(output));

	}

}
