package datastructure.bytedance.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 优先考虑哈希表（字符数组处理复杂，而且容易出错。）
 * 字符串先转成字符数组进行处理（这样代码看着舒服，也是通用的处理流程）
 * 优先考虑 foreach（不需要使用下标要优化成 foreach 循环）
 */
public class S387字符串中的第一个唯一字符 {

	public char firstUniqChar(String s) {
		Map<Character, Boolean> map = new HashMap<>(26);
		char[] chars = s.toCharArray();

		for (char ch : chars) {
			map.put(ch, !map.containsKey(ch));
		}

		for (char ch : chars) {
			if (map.get(ch)) {
				return ch;
			}
		}

		return ' ';
	}

}
