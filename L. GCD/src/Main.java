
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt();
		int gcd = 0;
		if (n2 > n1) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
