package stack;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class s144二叉树的前序遍历 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> nodeVals = new ArrayList<>();
		if (root == null) {
			return nodeVals;
		}

		Deque<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode curNode = stack.pop();
			nodeVals.add(curNode.val);
			if (curNode.right != null) {
				stack.push(curNode.right);
			}
			if (curNode.left != null) {
				stack.push(curNode.left);
			}
		}
		return nodeVals;
	}
}
