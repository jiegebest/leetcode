package stack.bytedance.simple;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class s20有效的括号 {
	public boolean isValid(String s) {
		int len = s.length();
		if (len % 2 == 1) {
			return false;
		}

		Map<Character, Character> bracketMap = new HashMap<>() {{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
		Deque<Character> stack = new LinkedList<>();

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (bracketMap.containsKey(ch)) {
				if (stack.isEmpty() || stack.peek() != bracketMap.get(ch)) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		return stack.isEmpty();
	}

}
