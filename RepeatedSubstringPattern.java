
public class RepeatedSubstringPattern {

	public static void main(String[] args) {

		System.out.println("Test case 1: " + repeatedSubstringPattern("abab"));
		System.out.println("Test case 2: " + repeatedSubstringPattern("aba"));
		System.out.println("Test case 3: " + repeatedSubstringPattern("abcabcabcabc"));

	}

	public static boolean repeatedSubstringPattern(String s) {

		int n = s.length(); // n is the length of s

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {

				int repeats = n / i;

				String subString = s.substring(0, i);

				StringBuilder sb = new StringBuilder();

				for (int j = 0; j < repeats; j++) {
					sb.append(subString);
				}
				if (sb.toString().equals(s)) {
					return true;
				}
			}

		}
		return false;

	}

}
