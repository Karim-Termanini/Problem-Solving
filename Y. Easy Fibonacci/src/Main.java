import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		fib(n);
	}

	public static void fib(int e) {
		int start = 0;
		int secound = 1;
		if (e == 1) {
			System.out.println(start);
		} else if (e == 2) {
			System.out.println(start + " " + secound);
		} else {
			System.out.print(start + " " + secound + " ");
			for (int i = 2; i < e; i++) {
				int result = start + secound;
				System.out.print(result + " ");
				start = secound;
				secound = result;
			}
		}
	}
}
