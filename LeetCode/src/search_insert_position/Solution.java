package search_insert_position;

class Solution {
    public static void main(String[] args) {
    	
    	int k = 3;
    	int k2 = k/2;
    	System.out.println(k2); //1
    	
    	int nums[] = {1,3,5,6};
    	int target = 5;
    	int ans = searchInsert(nums,target);
    	System.out.println(ans); //1
        
    }
    
    public static int searchInsert(int[] nums, int target) {
    	int l = 0;
    	int r = nums.length-1;
    	int mid;
    	while(l<=r) {
    		mid = (r-l)/2 + l;
    		if (nums[mid] == target) return mid;
    		if (nums[mid] > target) r = mid-1;
    		else l = mid+1;
    	}
    	return l;
    	
    }
    
}
