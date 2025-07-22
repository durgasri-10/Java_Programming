public class PatternMatcher {
		public static String findPatternMatch(String text, String pattern) {
		for (int i = 0; i <= text.length(); i++) {
		if (isMatch(text.substring(i), pattern)) {
		return text.substring(i);
		}
		}
		return "";
		}
		private static boolean isMatch(String text, String pattern) {
		if (pattern.isEmpty()) return text.isEmpty();
		boolean firstMatch = !text.isEmpty() &&
		(pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.');

		if (pattern.length() > 1 && pattern.charAt(1) == '*') {
		return isMatch(text, pattern.substring(2)) ||
		(firstMatch && isMatch(text.substring(1), pattern));
		} else if (pattern.length() > 1 && pattern.charAt(1) == '+') {
		return firstMatch && (isMatch(text.substring(1), pattern) ||
		isMatch(text.substring(1), pattern.substring(2)));
		} else {
		return firstMatch && isMatch(text.substring(1), pattern.substring(1));
		}
		}

		public static void main(String[] args) {
		System.out.println(findPatternMatch("abcbbcabb", "cb*cab+"));
		System.out.println(findPatternMatch("abcbbacbk", "bbk@go+"));
		}
		}