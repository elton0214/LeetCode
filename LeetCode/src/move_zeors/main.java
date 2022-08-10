package move_zeors;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Solution moveZeros = new Solution();
		
		int[] A1 = {1,-0,0,3,7};
		int[] A2 = {0};
		
		int output[] = moveZeros.moveZeros(A1);
		System.out.println(Arrays.toString(output));

	}

}
