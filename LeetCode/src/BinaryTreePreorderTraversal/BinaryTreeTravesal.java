package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTravesal {

	public BinaryTreeTravesal() {
		// TODO Auto-generated constructor stub
	}
	
	//直接印出來版本
	public void preorderTraversal(TreeNode treeNode) {
		
		if ( treeNode == null ) {
			return;
		}
		
		System.out.println(treeNode.val);
		
		preorderTraversal(treeNode.left);
		preorderTraversal(treeNode.right);
		
	}
	
	
	List<Integer> ans = new ArrayList<>();
	
	//Result是List版本
	public List<Integer> preorderTraversal2(TreeNode treeNode) {
		
		if ( treeNode == null ) {
			return ans;
		}
		
		ans.add(treeNode.val);
		
		preorderTraversal2(treeNode.left);
		preorderTraversal2(treeNode.right);
		
		return ans; // actually, never go here (write only for not getting error)
	}

}
