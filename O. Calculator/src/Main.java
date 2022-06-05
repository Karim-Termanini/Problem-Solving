import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String snum = in.nextLine();
		String n1, n2;
		int op = 0;
		CharSequence plus = "+", minus = "-", mal = "*", auf = "/";
		if (snum.contains(plus)) {
			op = snum.indexOf("+");
		} else if (snum.contains(minus)) {
			op = snum.indexOf("-");
		} else if (snum.contains(mal)) {
			op = snum.indexOf("*");
		} else if (snum.contains(auf)) {
			op = snum.indexOf("/");
		}
		n1 = snum.substring(0, op);
		n2 = snum.substring(op + 1, snum.length());

		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		if (snum.contains(plus)) {
			System.out.println(num1 + num2);
		} else if (snum.contains(minus)) {
			System.out.println(num1 - num2);
		} else if (snum.contains(mal)) {
			System.out.println(num1 * num2);
		} else if (snum.contains(auf)) {
			if (num2 == 0) {
				System.out.println("Con't be devided of Zero");
			} else {
				System.out.println(num1 / num2);
			}

		}
	}

}
