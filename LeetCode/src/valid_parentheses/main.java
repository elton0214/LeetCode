package valid_parentheses;

import java.util.HashSet;

public class main {

	public static void main(String[] args) {
//		hasCycle(listnode);

	}
	
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head != null) {
            if (set.contains(head.next)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

}


//Definition for singly-linked list.
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
       val = x;
       next = null;
  }
}

