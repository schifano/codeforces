import java.util.*;

public class WordCapitalization {
	
	public static String capitalizeFirstLetterOfWord(String word) {
		// Check if first letter is already capitalized
		int firstLetterValue = word.charAt(0);
		if (firstLetterValue >= 65 && firstLetterValue <= 90) {
			return word;
		} else {
			char firstLetter = word.charAt(0);
			String stringValueOfFirstLetter = String.valueOf(firstLetter);
			stringValueOfFirstLetter = stringValueOfFirstLetter.toUpperCase();
			return stringValueOfFirstLetter + word.substring(1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		System.out.println(capitalizeFirstLetterOfWord(word));
	}
}