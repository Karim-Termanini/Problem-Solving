import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int max = 0, min = 0;
		if (n1 >= n2 && n1 >= n3) {
			if (n2 >= n3) {
				System.out.print(n3 + " " + n1);
			}
		} else if (n2 >= n1 && n2 >= n3) {
			if (n1 >= n3) {
				System.out.print(n3 + " " + n2);
			}
		} else if (n3 >= n1 && n3 >= n2) {
			if (n1 >= n2) {
				System.out.print(n1 + " " + n3);
			}
		}

	}

}
