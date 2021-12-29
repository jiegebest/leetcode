package tree;

import common.Node;

public class Recursion {
	// 先序 中序 后序
	private void preOrderRecur(Node head) {
		if (head == null) {
			return;
		}
		System.out.println(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}




}
