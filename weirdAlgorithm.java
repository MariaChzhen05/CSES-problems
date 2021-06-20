/*
	CSES PSET
	@author MariaChzhen05
*/
import java.util.Scanner;

public class weirdAlgorithm {
	public static void main(String args[]) {
		
		long n;

		Scanner input = new Scanner(System.in);
		n = input.nextLong();
		System.out.print(n+" ");

		while (n>1) {
			if (n%2==0) {
				n/=2;
				System.out.print(n+" ");
			}
			else {
				n=3*n+1;
				System.out.print(n+" ");
			}
		}
	}
}