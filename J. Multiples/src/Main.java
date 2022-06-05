import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("Multiples");
		} else {
			System.out.println("No Multiples");
		}
	}

}
