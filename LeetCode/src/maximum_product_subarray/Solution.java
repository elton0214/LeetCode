package maximum_product_subarray;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {-4,-3,-2};
		int ans = maxProduct(nums);
		
		System.out.println(ans);
		
	}
	
	
    public static int maxProduct(int[] nums) {
    	 int current = nums[0];
         int currentMax = nums[0];
         int currentMin = nums[0];
         int tempMax = nums[0];
         int max = nums[0];

         for ( int i = 1; i < nums.length; i++) {
             current = nums[i];
             tempMax = currentMax;
             currentMax = Math.max(Math.max(current, current*currentMax), current*currentMin);
             currentMin = Math.min(Math.min(current, current*tempMax), current*currentMin);
             // System.out.println(current +" "+ currentMax+" "+ currentMin);

             max = Math.max(max, currentMax);
         }
         return max;
    }

}
