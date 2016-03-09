import java.util.*;
import java.io.*;

public class CapsLock {
	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();

		// if single char and lowercase
		if (word.length() == 1) {
			int ascii = (int) word.charAt(0);
			if (ascii >= 97 && ascii <= 122) {
				word = word.toUpperCase();
			} else if (ascii >= 65 && ascii <= 90) {
				word = word.toLowerCase();
			}
		} else {
			// if all char are uppercase (ascii range 65-90), convert to all lowercase
			boolean foundLowerCaseLetter = false;
			for (int i = 0; i < word.length(); i++) {
				char letter = word.charAt(i);
				int asciiLetter = (int) letter;
				if (asciiLetter >= 97 && asciiLetter <= 122) {
					foundLowerCaseLetter = true;
					break;
				}
			}
			if (!foundLowerCaseLetter) {
				word = word.toLowerCase();
			}
			// first char is lowercase and the rest are uppercase
			char letter = word.charAt(0);
			int asciiLetter = (int) letter;
			if (asciiLetter >= 97 && asciiLetter <= 122) {
				foundLowerCaseLetter = false;
				// loop through checking remaining characters
				for (int i = 1; i < word.length()-1; i++) {
					char aLetter = word.charAt(i);
					int aAsciiLetter = (int) aLetter;
					if (aAsciiLetter >= 97 && aAsciiLetter <= 122) {
						foundLowerCaseLetter = true;
						break;
					}
				}
				if (!foundLowerCaseLetter) {
					String word1 = word.substring(0,1).toUpperCase();
					String word2 = word.substring(1,word.length()).toLowerCase();
					word = word1 + word2;
				}
			}
		}
		System.out.println(word);
	}
}