package two_sum;

import java.util.Arrays;

public class Solution_twoPointer {

	public static void main(String[] args) {
		
		int[] A1 = {-10,-5,0,3,7};
		int[] A2 = {0,2,5,8,17};
		int[] A3 = {-10,-5,3,4,7,9};
		
		int output[] = twoSum(A2,10);
		System.out.println(Arrays.toString(output));


	}
	
	public static int[] twoSum(int[] A, int target) {
		int front = 0;
		int tail = A.length-1;
		int output[]= {-1,-1};
		
		while (A[front] + A[tail] != target) {
			if (front == tail) { 
				return output;
			};
			int k = target < ( A[front] + A[tail] ) ? tail-- : front++;
		}
		
		output[0] = front+1;
		output[1] =	tail+1;
		return output;
	}

}
