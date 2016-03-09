import java.util.*;
import java.io.*;

public class Football {

	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int counter = 0;
		char curr, prev;
		curr = prev = 'a';
		for (int i = 0; i < str.length(); i++) {
			curr = str.charAt(i);

			if (curr == prev) {
				counter++;
				if (counter == 7) {
					System.out.println("YES");
					System.exit(0);
				}
			} else {
				counter = 0;
				counter++;
			}
			prev = curr;
		}
		System.out.println("NO");
	}
}