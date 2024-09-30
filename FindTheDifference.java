import java.util.HashMap;

public class FindTheDifference {

	public char findTheDifference(String s, String t) {

		char extraChar = ' '; // creating a char variable to store the extra char

		HashMap<Character, Integer> counterS = new HashMap<>(); // using hashmap to track the the redundant char

//        int i;
//        
//        for(i = 0; i < s.length(); i++) {
//        	
//        	char ch = s.charAt(i); // returns the values of each index of s's inputs
//        	
//        	counterS.put(ch, counterS.getOrDefault(ch, 0) + 1); // updating the char and the values for each iteration 
//        
//        }
//        
//        for(i = 0; i < t.length(); i += 1) {
//        	
//        	char ch = t.charAt(i);
//        	
//        	int chCount = counterS.getOrDefault(ch, 0);
//        	
//        	if(chCount == 0) {
//        		
//        		extraChar = ch;
//        		
//        		break;
//        		
//        	}
//        	else {
//        		counterS.put(ch, chCount - 1);
//        	}
//        }
//        
//        return extraChar;

		// Iterate through string s to count the frequency of each character using an
		// enhanced for loop.
		for (char ch : s.toCharArray()) {
			// Update the counterS map, incrementing the frequency of the character.
			counterS.put(ch, counterS.getOrDefault(ch, 0) + 1);
		}

		// Iterate through string t to find the character which is not in s using an
		// enhanced for loop.
		for (char ch : t.toCharArray()) {
			int countOfChar = counterS.getOrDefault(ch, 0);

			// If the character in t is not found in s (count is 0), it's the extra
			// character.
			if (countOfChar == 0) {
				extraChar = ch;
				break;
			} else {
				// If the character is found, reduce its frequency in counterS.
				// This eliminates the possibility of a false match later.
				counterS.put(ch, countOfChar - 1);
			}
		}

		// Return the extra character found in string t.
		return extraChar;

	}

}
