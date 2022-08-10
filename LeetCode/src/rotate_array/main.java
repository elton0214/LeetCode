package rotate_array;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Solution rotateArray = new Solution();
		
		int[] a = {1,2,3,4,5};
		int[] b = {1};
		rotateArray.rotate(b, 3);
		
		System.out.println(Arrays.toString(b));
	}

}
