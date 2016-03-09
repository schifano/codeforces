/*
A. Next Round
time limit per test3 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.

Sample test(s)
input
8 5
10 9 8 7 7 7 5 5
output
6
input
4 2
0 0 0 0
output
0
Note
In the first example the participant on the 5th place earned 7 points. As the participant on the 6th place also earned 7 points, there are 6 advancers.

In the second example nobody got a positive score.

http://codeforces.com/problemset/problem/158/A
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class NextRound{
	
	public static int advancingParticipants(int n, int k, int[] scores){
		//System.out.println(n + ", " + k + ", " + Arrays.toString(scores)); // It works!
		int advanced = 0;
		
		if(scores[0] == 0){
			return 0;
		}

		for(int i = 0; i < scores.length; i++){
			if(advanced <= k){
				advanced++;
			}else if(scores[i] == scores[i-1]){
				advanced++;
			}else{
				return advanced;
			}
		}
		return advanced;
	}

	public static void main(String[] args){

		try{
			Scanner sc = new Scanner(new File(args[0]));
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] scores = new int[n];
			int count = 0;
			while(sc.hasNextInt()){
				scores[count++] = sc.nextInt();
			}
			System.out.println(advancingParticipants(n, k, scores));

		}catch(FileNotFoundException e){
			System.out.println("Could not load the file...");
		}
	}
}












