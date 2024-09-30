public class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {

		// creating two variables m and n to store the length of word1 and word2
		int m, n;
		int i, j;

		m = word1.length();
		n = word2.length();

		i = 0;
		j = 0;

		// Mutable StringBuilder used to concatenate letters to results
		StringBuilder result = new StringBuilder();

		while (i < m || j < n) {
			if (i < m) {

				// appending word1[i] to results and increment i by 1
				result.append(word1.charAt(i++));

			}
			if (i < n) {

				// appending word2[j] to results and increment i by 1
				result.append(word2.charAt(j++));

			}

		}
		return result.toString();

	}
}
