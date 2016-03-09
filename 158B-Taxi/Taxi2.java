import java.io.*;
import java.util.*;

public class Taxi2 {

	public static void main(String[] args) {
		// Read standard input
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		// Grab n - total number of groups
		int n = sc.nextInt();
		int one, two, three, four, curr;
		one = two = three = four = curr = 0;
		// Grab each group number and count total for each [1, 2, 3, 4]
		for (int i = 0; i < n; i++) {
			curr = sc.nextInt();
			if (curr == 1) {
				one++;
			} else if (curr == 2) {
				two++;
			} else if (curr == 3) {
				three++;
			} else {
				four++;
			}
		}

		int taxi = 0;
		taxi += four; // Groups of 4 children automatically get an optimal taxi

		// Combination of 3 + 1
		if (one > three) {
			one -= three; // one should have remaining
			taxi += three;
			three = 0;
		}
		if (three > one) {
			three -= one; // three should have remaining
			taxi += one;
			one = 0;
		}
		if (three == one) {
			taxi += three; // doesn't matter
			three = 0;
			one = 0;
		}
		// If there is a three remaining, there is no one remaining, so just add them
		taxi += three;

		// Combination of 2 + 2
		if (two >= 2) {
			taxi += (two / 2);
			// If there is a two remaining, there can only be (1) two
			two = two % 2;
		}
		if (two == 1 && one >= 2) {
			taxi++;
			one -= 2;
		}
		// Check if remaining ones can be put in groups of four
		if (one >= 4) {
			taxi += (one / 4);
			one = one % 4;
		}
		// There are less than four remaining ones
		if (one > 0) {
			taxi++;
		}


		// If there is a 1 remaining or a 2 remaining...
		// Not sure how to handle remaining two and one
		// two = two * 2;
		// if (two != 0 && two + one <= 4) {
		// 	taxi++;
		// }
		// TEST
		// System.out.println("1: " + one);
		// System.out.println("2: " + two);
		// System.out.println("3: " + three);
		// System.out.println("4: " + four);
		// System.out.println("Taxi: " + taxi);
		out.println(taxi);
		out.close();
	}
}