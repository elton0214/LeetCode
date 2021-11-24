package LC202_HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isHappy(int n) {
		int sum;
		int d;
		Set<Integer> set = new HashSet<Integer> (); 
		
		while (n!=1) {
			d=0;
			sum =0;
			while (n!=0) {
				d = n%10;
				n=n/10;
				sum += Math.pow(d,2);
			}
			n = sum;
			
			if (set.contains(n)) {
				return false;
			}else {
				set.add(n);
			}
		}
		return true;
	}
}
