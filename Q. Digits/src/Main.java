import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();
		String sum = "";
		while (counter > 0) {
			String num = in.next();
			for (int i = 0; i < num.length(); i++) {
				sum = num.charAt(i) + " " + sum;
			}
			System.out.println(sum);
			sum = "";
			counter--;
		}

	}

}
