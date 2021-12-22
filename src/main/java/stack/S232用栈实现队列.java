package stack;

import java.util.Deque;
import java.util.LinkedList;

public class S232用栈实现队列 {
	private Deque<Integer> stackFirst;
	private Deque<Integer> stackSecond;

	public S232用栈实现队列() {
		stackFirst = new LinkedList<>();
		stackSecond = new LinkedList<>();
	}

	public void push(int x) {
		stackFirst.push(x);
	}

	public int pop() {
		pushAllFirstToEmptySecond();
		return stackSecond.pop();
	}

	public int peek() {
		pushAllFirstToEmptySecond();
		return stackSecond.peek();
	}

	// 单个push操作或者pop操作没必要触发一次缓冲区冲刷，仅在必要时进行一次全量的冲刷。
	private void pushAllFirstToEmptySecond() {
		if (stackSecond.isEmpty()) {
			while (!stackFirst.isEmpty()) {
				stackSecond.push(stackFirst.pop());
			}
		}
	}

	public boolean empty() {
		return stackFirst.isEmpty() && stackSecond.isEmpty();
	}
}
