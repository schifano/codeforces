import java.util.*;
import java.io.*;

public class BitPlusPlus {

	public static void main(String[] args) {
		// Grab input
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int counter = 0;
		for (int i = 0; i < n; i++) {
			String line = sc.next(); // nextLine() caused it to prematurely stop
			if (line.contains("+")) {
				counter++;
			}
			if (line.contains("-")) {
				counter--;
			}
		}
		System.out.println(counter);
	}
}