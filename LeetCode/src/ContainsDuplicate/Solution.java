package ContainsDuplicate;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {2,11,15,7,2};
		boolean ans = ContainsDuplicate(nums);
		
		System.out.println(ans);
		
	}
	
	
    public static boolean ContainsDuplicate(int[] nums) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (!set.contains(nums[i])) {
    			set.add(nums[i]);
    		} else {
    			return true;
    		}
    		
    	}
    	return false;
    }

}
