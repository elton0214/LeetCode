package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {2,11,15,7};
    	int target = 9;
		int ans[] = twoSum(nums,target);
		
		System.out.println(Arrays.toString(ans));
		
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int diff = target - nums[i];
    		
    		if ( map.containsKey(nums[i]) ) {
    			return new int[] {map.get(nums[i]),i}; 
    		} else {
    			map.put(diff, i);
    		}
    	}
    	return new int[] {0,0};
    }

}
