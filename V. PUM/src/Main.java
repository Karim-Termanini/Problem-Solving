import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();
		int c = 1;
		for (int i = 1; i <= counter; i++) {
			for (int j = 1; j <= 4; j++) {
				if (c % 4 != 0) {
					System.out.print(c + " ");
				} else {
					System.out.print("PUM");
				}
				c++;
			}
			System.out.println();
		}

	}

}
