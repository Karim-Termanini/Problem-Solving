import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n1 = in.nextLong(), n2 = in.nextLong(), n3 = in.nextLong(), n4 = in.nextLong();
		if (((n1 * n2 - n3) == n4) || ((n1 * n2 + n3) == n4) || ((n1 - n2 * n3) == n4) || ((n1 + n2 * n3) == n4)
				|| ((n1 + n2 - n3) == n4) || ((n1 - n2 + n3) == n4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
