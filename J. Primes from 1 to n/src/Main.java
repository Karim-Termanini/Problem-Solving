	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		if (n1 == 1) {
			n1++;
		}
		for (int i = n1; i <= n2; i++) {
			int sum = prime(i);
			if (sum != -1) {
				System.out.println(i);
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
