package stack.bytedance.simple;

import common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1 0 1
 * 1 2 2 1
 */
public class S234回文链表 {
	public boolean isPalindrome(ListNode head) {
		int len = getLinkedListLength(head);

		Deque<Integer> stack = new LinkedList<>();
		ListNode p = head;
		for (int i = 0; i < len / 2; i++) {
			stack.push(p.val);
			p = p.next;
		}

		if (len % 2 == 1) {
			p = p.next;
		}

		while (p != null) {
			if (stack.pop() != p.val) {
				return false;
			}
			p = p.next;
		}
		return true;
	}

	private int getLinkedListLength(ListNode head) {
		ListNode p = head;
		int len = 0;
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}
}
