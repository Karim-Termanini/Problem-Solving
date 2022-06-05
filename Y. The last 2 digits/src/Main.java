import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		int num1 = n1 % 100;
		int num2 = n2 % 100;
		int num3 = n3 % 100;
		int num4 = n4 % 100;
		int result = num1 * num2 * num3 * num4;
		int sum = result % 100;
		if (sum <= 9) {
			System.out.println("0" + sum);
		} else {
			System.out.println(sum);
		}

	}

}
