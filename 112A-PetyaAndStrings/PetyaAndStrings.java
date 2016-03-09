import java.util.*;
import java.io.*;

public class PetyaAndStrings {
	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String str1 = sc.next();
		String str2 = sc.next();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// check if strings are equal
		if (str1.equals(str2)) {
			out.println(0);
		}

		for (int i = 0; i < str1.length(); i++) {
			char str1Letter = str1.charAt(i);
			char str2Letter = str2.charAt(i);

			if (str1Letter != str2Letter) {
				if (str1Letter < str2Letter) {
					// out.println(-1); Why does this not print with a System.exit(0)?
					System.out.println(-1);
					System.exit(0);
				} else {
					System.out.println(1);
					System.exit(0);
				}
			}
		}
		out.close();
	}
}