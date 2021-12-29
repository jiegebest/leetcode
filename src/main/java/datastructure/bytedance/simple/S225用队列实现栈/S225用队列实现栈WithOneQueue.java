package datastructure.bytedance.simple.S225用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

// 用一个队列实现：记录对内元素个数，入队后，将前面几个元素，重新入队。完成逆序。
public class S225用队列实现栈WithOneQueue {
	private Queue<Integer> queue;

	public S225用队列实现栈WithOneQueue() {
		queue = new LinkedList<>();
	}

	public void push(int x) {
		int size = queue.size();
		queue.offer(x);
		for (int i = 0; i < size; i++) {
			queue.offer(queue.poll());
		}
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
