package maximum_subarray;

public class Solution2 {

	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maximumSubarray(nums);
		
		System.out.println(ans);
		
	}
	
	
    public static int maximumSubarray(int[] nums) {
    	int currentMax = nums[0];
    	int current = nums[0];
    	int max = nums[0];
    	
    	for (int i = 1; i<nums.length; i++) {
    		current = nums[i];
    		currentMax = Math.max(current, current+currentMax);
    		
    		max = Math.max(max, currentMax);
    	}
    	

    	return max;
    }

}
