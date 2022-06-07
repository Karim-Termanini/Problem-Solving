import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		for (int i = 2; i <= num; i++) {
			int sum = prime(i);
			if (sum != -1) {
				System.out.print(sum + " ");
			}
		}
	}

	public static int prime(int num) {
		int div = num / 2;
		for (int i = 2; i <= div; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}
}
