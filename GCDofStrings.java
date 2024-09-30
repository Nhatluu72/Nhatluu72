public class GCDofStrings {

	public static void main(String[] args) {

		String s1 = "ABABAB";
		String s2 = "ABAB";

		String result = gcdOfStrings(s1, s2);
		System.out.println(result);

	}

	public static String gcdOfStrings(String str1, String str2) {

		StringBuilder result = new StringBuilder();

		int minLength = Math.min(str1.length(), str2.length());
		for (int i = 0; i < minLength; i++) {

			if (str1.charAt(i) == str2.charAt(i)) {
				result.append(str1.charAt(i));
			} else {
				break;
			}

		}
		return result.toString();
	}
}
