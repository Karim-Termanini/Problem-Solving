
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				System.out.println(i);
			}
		}
	}

}
