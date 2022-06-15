import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= counter; i++) {
			if (i / 10 == 0) {
				if (i >= n1 && i <= n2) {
					sum += i;
				}
			} else {
				int num = i;
				int mySum = 0;
				while (num != 0) {
					int rem = num % 10;
					mySum += rem;
					num /= 10;

				}
				if (mySum >= n1 && mySum <= n2) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	
	}

}
