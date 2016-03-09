/*
	B. Taxi
*/
import java.util.*;
import java.io.*;

public class Taxi {

	public static void main(String[] args) {
		// Standard input
		Scanner sc = new Scanner(System.in);
		
		// Get total number of groups
		int n = sc.nextInt();

		int taxiCounter = 0;
		int groupSize = 0;
		int currGroupSum = 0;

		for (int i = 0; i > n; i++) {
			groupSize = sc.nextInt();
			if (groupSize >= 3) {
				taxiCounter++;
			} 
			if (currGroupSum >= 3) {
				taxiCounter++;
				currGroupSum = 0;
			} else {
				currGroupSum += groupSize;
			}
		}
		System.out.println(taxiCounter);
		// If less than 4 but only integer remaining, taxi++
	}
}