package kth_largest_element_in_stream;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
    	
//    	//創建優先隊列
//        PriorityQueue<Integer> pq =  new  PriorityQueue<>();
//
//        //使用add()方法
//        pq. add ( 4 );
//        pq. add ( 2 );
//        pq. add ( 9 );
//        pq. add ( 7 );
//        pq. add ( 3 );
//        pq. offer ( 6 );
//        System. out .println( "PriorityQueue: "  + pq);
//        while (!pq.isEmpty()) {
//        	System. out .println( "PriorityQueue: "  + pq.poll());
//        }
    	
    	int k = 3;
    	int nums[] = {1,5,3,6,7};
    	
    	KthLargest kl = new KthLargest(k, nums);
    	kl.add(2);
    	kl.add(3);
    	kl.add(5);
    	kl.add(9);

        
    }
}

class KthLargest {
	PriorityQueue<Integer> pq;
	final int k;
	
    public KthLargest(int k, int[] nums) {
    	pq = new PriorityQueue<Integer>();
    	this.k = k;
    	for (int e: nums)	this.add(e);
    	        
    }
    
    public int add(int e) {
    	pq.add(e);
    	if (pq.size() > k)	pq.poll();
    	
    	System.out.println(pq.peek());
    	return 0;
//    	return pq.peek();
    	
    }
}

