import java.util.*;
import java.io.*;

public class StonesOnTheTable {

	public static int minNumberOfStonesToRemove(int n, String stones) {
		// Base case, meaning we only have a string of length 1 and thus all unique neighbors
		if (n == 1) { // O(1)
			return 0;
		}

		int currentColor, previousColor, counter;
		currentColor = previousColor = counter = 0;
		// O(n)
		for (int i = 0; i < n; i++) {
			currentColor = (int) stones.charAt(i);

			if (currentColor == previousColor) {
				counter++;
			}
			previousColor = currentColor;
		}
		return counter;
	}

	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String stones = sc.next();

		System.out.println(minNumberOfStonesToRemove(n, stones)); // output result
	}
}