import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		int n1 = num / 10;
		int n2 = num % 10;
		if (num < 10 || num >= 100) {
			System.out.println("NO");
		} else {
			if (n2 == 0 || n1 % n2 == 0 || n2 % n1 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
