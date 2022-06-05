import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		int start = 0;
		int end = 0;
		if ((n3 < n1 && n4 < n1) || (n3 > n2 && n4 > n1)) {
			System.out.println(-1);
			return;
		} else {
			if (n1 > n3) {
				start = n1;
			} else {
				start = n3;
			}
			if (n2 < n4) {
				end = n2;
			} else {
				end = n4;
			}
		}
		System.out.println(start + " " + end);
	}

}
