import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String snum = in.nextLine();
		String num1, num2;
		String rihgt = "Right", wrong = "Wrong";
		int op = 0;
		int n1 = 0;
		int n2 = 0;
		CharSequence smaler = "<", greater = ">", equal = "=";
		if (snum.contains(smaler)) {
			op = snum.indexOf("<");
		} else if (snum.contains(greater)) {
			op = snum.indexOf(">");
		} else if (snum.contains(equal)) {
			op = snum.indexOf("=");
		}
		num1 = snum.substring(0, op);
		num2 = snum.substring(op + 1, snum.length());
		n1 = Integer.parseInt(num1.trim());
		n2 = Integer.parseInt(num2.trim());
		if (snum.contains(smaler)) {
			if (n1 < n2) {
				System.out.println(rihgt);
			} else {
				System.out.println(wrong);
			}
		} else if (snum.contains(greater)) {
			if (n1 > n2) {
				System.out.println(rihgt);
			} else {
				System.out.println(wrong);
			}
		} else if (n1 == n2) {
			System.out.println(rihgt);
		} else {
			System.out.println(wrong);
		}
	}

}
