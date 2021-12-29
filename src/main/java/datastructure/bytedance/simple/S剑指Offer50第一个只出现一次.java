package datastructure.bytedance.simple;

/**
 * 能用哈希表还是用哈希表，字符数组容易搞错下标关系。
 */
public class S剑指Offer50第一个只出现一次 {
	public char firstUniqChar(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		for (int index = 0; index < s.length(); index++) {
			int chas = s.charAt(index) - 97;
			if (arr[chas] == -1) {
				arr[chas] = index;
			} else if (arr[chas] != -2) {
				arr[chas] = -2;
			}
		}

		int minIndex = 50000;
		int charIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1 && arr[i] != -2 && arr[i] < minIndex) {
				minIndex = arr[i];
				charIndex = i;
			}
		}

		return minIndex == 50000 ? ' ' : (char) (charIndex + 97);
	}
}
