import java.util.*;
import java.io.*;

public class HelpfulMaths {

	public static String rearrange(String str) {
		// Base case
		if (str.length() == 1) {
			return str;
		}

		int ones, twos, threes;
		ones = twos = threes = 0;
		for (int i = 0; i < str.length(); i++) {
			char num = str.charAt(i);
			// Total all numbers
			switch (num) {
				case '1': ones++;
					break;
				case '2': twos++;
					break;
				case '3': threes++;
					break;
				default:
					break;
			}
		}
		// Return concatenated string
		String rearrange = "";
		for (int i = 0; i < ones; i++) {
			rearrange += "1";
			if (i != (ones-1) || (twos != 0 || threes != 0)) {
				rearrange += "+";
			}
		}
		for (int i = 0; i < twos; i++) {
			rearrange += "2";
			if (i != (twos-1) || threes != 0) {
				rearrange += "+";
			}
		}
		for (int i = 0; i < threes; i++) {
			rearrange += "3";
			if (i != (threes-1)) {
				rearrange += "+";
			}
		}
		return rearrange;
	}

	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(rearrange(str)); // output result
	}
}