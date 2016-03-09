import java.util.*;
import java.io.*;

public class Bit {

	public static void main(String[] args) {
		// Grab input
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int counter;
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			if (line.contains("+")) {
				counter++;
			} else {
				counter--;
			}
		}
		return counter;
	}
}