import java.util.Scanner;

public class IncreasingArray {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max=0;
		long answer=0;
		for (int i = 0; i<n; i++) {
			int x = input.nextInt();
			max = Math.max(x, max);
			answer+=max-x;
		}
		System.out.println(answer);
	}
}
