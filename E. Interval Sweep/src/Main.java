import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt();
		if (n1 == 0 && n2 == 0 || Math.abs(n1 - n2) >= 2) {
			System.out.println("NO");
		} else {
			System.out.println("Yes");
		}
	}

}
