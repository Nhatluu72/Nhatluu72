public class FindTheDifferenceDemo {
	public static void main(String[] args) {
		FindTheDifference solution = new FindTheDifference();

		// Test case 1: Extra character is 'e'
		String s1 = "abcd";
		String t1 = "abcde";
		char result1 = solution.findTheDifference(s1, t1);
		System.out.println("Test case 1: " + result1); // Expected output: 'e'

		// Test case 2: Extra character is 'y'
		String s2 = "xyz";
		String t2 = "yzxy";
		char result2 = solution.findTheDifference(s2, t2);
		System.out.println("Test case 2: " + result2); // Expected output: 'y'

		// Test case 3: Extra character is 'f'
		String s3 = "apple";
		String t3 = "fapple";
		char result3 = solution.findTheDifference(s3, t3);
		System.out.println("Test case 3: " + result3); // Expected output: 'f'

		// Test case 4: Extra character is 'z'
		String s4 = "abc";
		String t4 = "abcz";
		char result4 = solution.findTheDifference(s4, t4);
		System.out.println("Test case 4: " + result4); // Expected output: 'z'
	}
}
