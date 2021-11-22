package LC189_RotateArray;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
    	
    	//prevent k is bigger than nums.length
		k = k%nums.length;
		
		int[] temp = new int[k];
		
    	//extract last k numbers
    	System.arraycopy(nums, nums.length-k , temp, 0, k);
    	
    	//move the rest back
    	System.arraycopy(nums, 0, nums, k, nums.length-k);
    	
    	//put the extracted elements back to the front of the original array
    	System.arraycopy(temp, 0 , nums, 0, k);
    }
}
