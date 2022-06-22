import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int div = n / 2;
		int flag = 0;
		for (int i = 2; i <= div; i++) {
			if (n % i == 0) {
				System.out.println("NO");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("yes");
		}
	}

}
