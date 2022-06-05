import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		char op = in.next().charAt(0);
		int n2 = in.nextInt();
		char equal = in.next().charAt(0);
		int result = in.nextInt();
		int sum = 0;
		if (op == '+') {
			sum = n1 + n2;
		} else if (op == '-') {
			sum = n1 - n2;
		} else if (op == '*') {
			sum = n1 * n2;
		} else if (op == '/') {
			if (n2 == 0) {
				System.out.println("can't be devided of Zero");
			} else {
				sum = n1 / n2;
			}
		}
		if (sum == result) {
			System.out.println("Yes");
		} else {
			System.out.println(sum);
		}

	}

}
