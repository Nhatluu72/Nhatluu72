public class FindTheIndexOfTheFirstOccurenceInAString {

	public static int strStr(String haystack, String needle) {

		int m, n, i;

		m = needle.length();
		n = haystack.length();

//        for(int windowStart = 0; windowStart <= n - m; windowStart++){
//            int i = 0;
//            windowStart += i;
//            if(windowStart == i){
//
//                i++;
//
//            }else {
//            	windowStart++;
//            	i = 0;
//            }
//            return windowStart;
//        }

		for (i = 0; i < n - m + 1; i++) {

			if (haystack.charAt(i) == needle.charAt(0)) {

				if (haystack.substring(i, m + i).equals(needle)) {

					return i;
				}

			}

		}
		return -1;
	}

}
