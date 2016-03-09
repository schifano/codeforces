/*
	A. Way Too Long Words
	time limit per test2 seconds
	memory limit per test256 megabytes
	inputstandard input
	outputstandard output
	Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

	Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

	This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

	Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

	You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

	Input
	The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

	Output
	Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
*/
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class WayTooLongWords {

	public static void abbreviateLongWord(String str) {
		// store length of the string
		int length = str.length();
		// check if string is greater than length of 10
		if (length > 10) {
			// Don't need to use a sb, not as efficient
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(0));
			sb.append(length-2);
			sb.append(str.charAt(length-1));
			System.out.println(sb.toString());
		} else {
			System.out.println(str);
		}
	}

	// Main
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int n = Integer.parseInt(sc.next());

			for (int i = 0; i < n; i++) {
				// System.out.println(sc.next()); // TEST
				// Pass in each String to abbreviate
				abbreviateLongWord(sc.next());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}