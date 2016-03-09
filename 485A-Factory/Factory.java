/*
	Issue 1: Before we were using a while loop which meant that the loop didn't guarantee 
	executing at least 10^5 (100000) times. We changed that to a for loop.

	Issue 2: The values were getting too large for int values and overflowing. Thus, we changed to using long.
*/
import java.util.*;

public class Factory{

	public static boolean productionWillStop(long a, long m){
		for (int i = 0; i < 100000; i++) {
			if (a % m == 0){
				System.out.println("Yes");
				return true;
			}
			a += a % m;
		}
		System.out.println("No");
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long m = in.nextLong();
		productionWillStop(a, m);
	}
}