import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();

		if (num == (int) num) {
			System.out.println("int " + (int) num);
		} else {
			float n1 = (float) (num % 1);
			System.out.println("float " + (int) num + " " + n1);
		}

	}

}
