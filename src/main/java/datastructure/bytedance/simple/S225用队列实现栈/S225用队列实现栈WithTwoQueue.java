package datastructure.bytedance.simple.S225用队列实现栈;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 在插入时利用辅助队列完成元素的逆序插入。
 */
public class S225用队列实现栈WithTwoQueue {
	private Queue<Integer> queue;
	private Queue<Integer> help;

	public S225用队列实现栈WithTwoQueue() {
		queue = new LinkedList<>();
		help = new LinkedList<>();
	}

	public void push(int x) {
		help.offer(x);
		while (!queue.isEmpty()) {
			help.offer(queue.poll());
		}
		Queue<Integer> tmp = queue;
		queue = help;
		help = tmp;
	}

	public int pop() {
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}

}
