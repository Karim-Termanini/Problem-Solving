import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long Memo, Momo, n;
		Memo = in.nextLong();
		Momo = in.nextLong();
		n = in.nextLong();
		if (Memo % n == 0 && Momo % n == 0) {
			System.out.println("Both");
		} else if (Memo % n == 0 && Momo % n != 0) {
			System.out.println("Memo");
		} else if (Memo % n != 0 && Momo % n == 0) {
			System.out.println("Momo");
		} else {
			System.out.println("No One");
		}
	}

}
