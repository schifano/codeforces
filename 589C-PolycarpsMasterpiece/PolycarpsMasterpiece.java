/*
	n - number of days
	m - number of requests
	k - circular shift at ksubi
	l - beginning inclusive index
	r - ending inclusive index
	c - letter c
*/
import java.util.*;
import java.io.*;

public class PolycarpsMasterpiece {

	// Initialize array with word
	public static char[] initialize(String str) {
		char[] array = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
			// System.out.println(array[i]); // TEST
		}
		return array;
	}

	// Circular shift and append times the number of days n
	public static char[] circularShift(char[] currentArray, int k, int n) {

		if (n == 0) {
			return currentArray;
		}

		char[] copy = new char[currentArray.length * 2];
		// System.out.println(copy.length); // TEST

		// Copy over current array
		for (int i = 0; i < currentArray.length; i++) {
			copy[i] = currentArray[i];
		}

		// Copy over circular shift of current array
		int start = 0;
		if (k != 0) {
			start = currentArray.length-k;
		}
		int currentIndex = start;
		int copyIndex = currentArray.length;
		do {
			copy[copyIndex++] = currentArray[currentIndex++];
			if (currentIndex > currentArray.length-1) {
				currentIndex = 0;
			}
		} while (currentIndex != start);
		
		// TEST
		// for (int i = 0; i < copy.length; i++) {
		// 	System.out.println(copy[i]);
		// }

		currentArray = copy;
		
		return circularShift(currentArray, k, --n);
	}

	public static int processRequest(char[] currentArray, int l, int r, char letter) {
		int counter = 0;
		// Check substring
		for (int i = l-1; i < r; i++) {
			char curr = currentArray[i];
			// System.out.println("curr: " + curr + i); // TEST
			if (curr == letter) {
				counter++;
			}
		}
		return counter;
	}

	// Main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		String str = sc.next();	// masterpiece
		int n = sc.nextInt();		// n - days
		int m = sc.nextInt();		// m - requests
		int k = sc.nextInt(); 	// k - kth circular shift

		char[] arr = initialize(str);
		arr = circularShift(arr, k, n);
		
		// Loop through each request
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();	// beginning inclusive index
			int r = sc.nextInt();	// ending inclusive index
			char c = sc.next().charAt(0); // char to search for

			System.out.println(processRequest(arr, l, r, c));
		}

		// char[] arr = initialize(str);
		// arr = circularShift(arr, k, n);
		// int result = processRequest(arr, 1, 22, 'm');
		// System.out.println("result: " + result); // TEST
	}
}