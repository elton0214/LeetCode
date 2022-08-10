package merge_sorted_array;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) {
		int nums1[] = {4,5,6,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;

		
		int[] ans = mergeSortedArray(nums1, m, nums2, n);
		
		System.out.println(Arrays.toString(ans));
		
	}
	
	
    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

    	LinkedList<Integer> mergedList = new LinkedList<Integer>();
    	
    	for (int i = 0; i<m; i++) {
    		mergedList.add(nums1[i]);
		}
    	for (int i = 0; i<n; i++) {
    		mergedList.add(nums2[i]);
		}
    	
    	int[] mergedArr = new int[mergedList.size()];
    	for(int i = 0; i < mergedList.size(); i++) mergedArr[i] = mergedList.get(i);
    	
    	
    	return bubbleSort(mergedArr);
    }
    
    public static int[] bubbleSort(int[] arr) {
    	
    	for (int endIndex = arr.length - 1; endIndex >=0; endIndex--) {
	    	for(int startIndex = 0; startIndex < endIndex; startIndex++) {
	    		if (arr[startIndex+1] < arr[startIndex]) {
	    			int temp = arr[startIndex];
	    			arr[startIndex]   = arr[startIndex+1];
	    			arr[startIndex+1] = temp;
	    		}
	    	}
    	}
    	
    	return arr;
    }

}
