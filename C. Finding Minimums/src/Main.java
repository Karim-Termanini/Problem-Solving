import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int gruop = in.nextInt();
		int min = 0;
		int flag = 1;
		int counte = 0;
		for (int i = 1; i <= length; i++) {
			int num = in.nextInt();
			if (flag == 1) {
				min = num;
				flag = 0;
			} else {
				if (num < min) {
					min = num;
				}
			}
			counte++;
			if (counte == gruop||i==length) {
				System.out.println(min);
				counte = 0;
				flag = 1;
			}
		}
	}
}
