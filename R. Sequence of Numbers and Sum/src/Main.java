import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int n1 = 0, n2 = 0;
			long sum = 0;
			n1 = in.nextInt();
			n2 = in.nextInt();
			int max = 0, min = 0;
			if (n1 >= n2) {
				max = n1;
				min = n2;
			} else {
				max = n2;
				min = n1;
			}
			if (n1 <= 0 || n2 <= 0) {
				return;
			}
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
				sum += i;
			}
			System.out.println("sum =" + sum);
			sum = 0;
		}
	}

}
