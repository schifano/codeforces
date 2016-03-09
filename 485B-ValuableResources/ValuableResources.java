import java.util.*;

public class ValuableResources {
	public static long minArea = 0;
	
	public static long minX = 0;
	public static long minY = 0;
	public static long maxX = 0;
	public static long maxY = 0;

	public static long xCoord = 0;
	public static long yCoord = 0;
	
	public static void minMaxCoords(long x, long y) {
		if (x < minX) {
			minX = x;
		}
		if (x > maxX) {
			maxX = x;
		}
		if (y < minY) {
			minY = y;
		}
		if (y > maxY) {
			maxY = y;
		}
	} 

	public static long minArea() {
		xCoord = Math.abs(minX - maxX);
		yCoord = Math.abs(minY - maxY);

		if (xCoord > yCoord) {
			minArea = xCoord * xCoord;
		} else {
			minArea = yCoord * yCoord;
		}

		return minArea;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		maxX = minX = sc.nextInt();
		maxY = minY = sc.nextInt();

		long x = 0;
		long y = 0;

		for (int i = 1; i < n; i++) {
			x = sc.nextLong();
			y = sc.nextLong();
			minMaxCoords(x, y);
		}

		System.out.println(minArea());
	}
}