/*
	Team

	Are things like Scanners supposed to be written exclusively in the main?
*/
import java.util.*;
import java.io.*;

public class Team {

	// Main
	public static void main(String[] args) {
		// Take input from the command line
		Scanner sc = new Scanner(System.in); // input
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		// Grab values
		int n = sc.nextInt();
		int numProblems, knownSolution, numImplementations;
		numProblems = knownSolution = numImplementations = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				knownSolution = sc.nextInt();
				if (knownSolution == 1) {
					numProblems++;
					// System.out.println("numProblems: " + numProblems); // TEST
 					if (numProblems >= 2) {
						numImplementations++;
						// System.out.println("numImplementations: " + numImplementations); // TEST
						numProblems = 0;
					}
				}
			}
			numProblems = 0;
		}
		System.out.println(numImplementations);
		out.close();
	}
}