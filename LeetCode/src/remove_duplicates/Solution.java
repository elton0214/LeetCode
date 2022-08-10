package remove_duplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n: nums){
            if(i == 0 || n > nums[i - 1]){
                nums[i] = n;
                i++;
            }
        }
        System.out.println(i);
        return i;
        
//        for (int i=1; i<nums.length; i++) {
//        	if (nums[i]==nums[i-1] || nums[i]==99) {
//        		nums[i-1] = nums[i];
//        	}
//        }
//        
//        return nums;
    }
}
