package intersection_of_two_arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int nums1[] = {4,9,5};
		int nums2[] = {9,4,9,8,4};

		
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
				
		LinkedList<Integer> sameNumList = new LinkedList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (nums1[i] == list2.get(j)) {
					sameNumList.add(nums1[i]);
					list2.remove(j);
					break;
				}
			}
        }
		
		int[] ansArr = new int[sameNumList.size()];
		int k = 0;
		for (Integer i: sameNumList) {
			ansArr[k++] = i;
		}
		
		return ansArr;
    }

}
