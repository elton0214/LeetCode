package LC167_TwoSum;

public class TwoSum {
	
	public int[] TwoSum(int[] A, int target) {
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