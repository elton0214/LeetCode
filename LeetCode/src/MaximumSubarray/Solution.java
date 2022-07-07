package MaximumSubarray;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = MaximumSubarray(nums);
		
		System.out.println(ans);
		
	}
	
	
    public static int MaximumSubarray(int[] nums) {
    	LinkedList<Integer> sumList = new LinkedList<Integer>();
    	
    	for (int subArrLen = 1; subArrLen <= nums.length; subArrLen++) {
    		System.out.println("----subArrLen:" + subArrLen);
    		for (int startIndex = 0; startIndex <= nums.length - subArrLen; startIndex++) {
    			System.out.println("--startIndex:" + startIndex);
    			int subSum = sum(nums, startIndex, startIndex+subArrLen-1);
        		sumList.add(subSum); ;
        	}
    	}
    	
    	Collections.sort(sumList);
    	Collections.reverse(sumList);
    	int maxSum = sumList.get(0);
    	

    	return maxSum;
    }
    
    static int sum(int arr[], int startIndex, int endIndex) {
    	int sum = 0;
    	for (int i = startIndex; i <= endIndex; i++) {
    		sum += arr[i];
    	}
    	System.out.println("sum:" + sum);
    	return sum;
    }
}
