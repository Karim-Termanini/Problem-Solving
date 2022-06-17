import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int sum = 0;
		for (int i = 0; i <= start; i++) {
			for (int j = 0; j <= start; j++) {
				if (end - i - j >= 0 && end - i - j <= start) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
/* das geht auch aber braucht viel Zeit */
/*
 * long num1 = in.nextLong(); long num2 = in.nextLong(); int sum = 0; for (int i
 * = 0; i <= num1; i++) { for (int j = 0; j <= num1; j++) { for (int k = 0; k <=
 * num1; k++) { if ((i + j + k == num2) && (num2 - i - j - k == 0)) { sum++; }
 * 
 * } } } System.out.println(sum);
 */
