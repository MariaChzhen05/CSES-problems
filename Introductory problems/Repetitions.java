import java.util.Scanner;

public class Repetitions {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String inpDNA = input.next();
		int longest=1, curr=0;
		char l = 'A';

		for (int i=0; i < inpDNA.length(); i++) {
			char c=inpDNA.charAt(i);

			if (c != l) {
				l = c;
				curr =1;
			}
			else {
				curr+=1;
				longest = Math.max(curr, longest);
			}
			
		}
		System.out.println(longest);
	}
}