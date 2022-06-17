import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();

		long nlong = 0;
		for (int i = 0; i < counter; i++) {
			nlong = in.nextLong();
			int ones = 0;
			int sum = 0;
			while (nlong > 0) {
				if (nlong % 2 == 1) {
					ones++;
				}
				nlong /= 2;
			}

			for (int j = 0; j < ones; j++) {
				sum += 1 * Math.pow(2, j);
			}
			System.out.println(sum);
		}

	}
}
