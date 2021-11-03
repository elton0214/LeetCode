package LC1064_FixedPoint;

public class FixedPoint {

	public int FixedPoint(int[] A) {
		//Run Binary Search
		int head = 0;
		int tail = A.length -1;
		
		while (head+1 < tail){
			int mid = (head + tail)/2;
			if (A[mid] > mid) {
				tail = mid;
			} else {
				head = mid;
			}	
		}
		
		if (A[head] == head) {
			return head;
		} else if (A[tail] == tail) {
			return tail;
		} else {
			return -1;
		}
	}
}
