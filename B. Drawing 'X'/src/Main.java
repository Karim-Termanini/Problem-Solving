import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if (i == j && i != (n1 / 2) && j != (n1 / 2)) {
					System.out.print("\\");
				} else if (i == (n1 / 2) && j == (n1 / 2)) {
					System.out.print("X");
				} else if (j != n1 / 2 && i == ((n1 - 1) - j)) {
					System.out.print("/");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
