import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {

		ValidAnagram vA = new ValidAnagram();

		System.out.println(vA.isAnagram("anagram", "nagaram"));
		System.out.println(vA.isAnagram("rat", "car"));

	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);

	}
}
