import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, n4;
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		n4 = in.nextDouble();

		double sum1 = n2 * Math.log(n1);
		double sum2 = n4 * Math.log(n3);
		if (sum1 > sum2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
