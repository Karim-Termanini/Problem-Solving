import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();
		while (counter > 0) {
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int max = 0, min = 0, sum = 0;
			if (n1 >= n2) {
				max = n1;
				min = n2;
			} else {
				max = n2;
				min = n1;
			}
			for (int i = min + 1; i < max; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
			System.out.println(sum);
			counter--;
		}
	}

}
