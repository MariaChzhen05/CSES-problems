import java.util.Scanner;

public class MissingNumber {
	public static void main(String args[]) {
		long n, actualSum =0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		for (int i=0; i<n-1; i++) {
			int l = input.nextInt();
			actualSum+=l;
		}

		System.out.println(n*(n+1)/2-actualSum);

	}
}