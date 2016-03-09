import java.util.*;
import java.io.*;

public class HQ9Plus {
	public static String willProduceOutput(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			if (letter == 'H' || letter == 'Q' || letter == '9') {
				return "YES";
			}
		}
		return "NO";
	} 

	// main
	public static void main(String[] args) {
		// Get input
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(willProduceOutput(input));

	}
}