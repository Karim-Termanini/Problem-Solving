import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		for (int i = 1; i <= lines; i++) {
			for (int j = i; j < lines; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = lines; i >=1 ; i--) {
			for (int j = i; j < lines; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
