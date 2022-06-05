import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int firstDigit = 0;
		firstDigit = num / 1000;
		if (firstDigit % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

}
