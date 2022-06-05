import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Days = in.nextInt();
		int year = Days / 365;
		Days -= 365 * year;
		int month = Days / 30;
		Days -= month * 30;
		int day = Days;

		System.out.println(year + " years");
		System.out.println(month + " months");
		System.out.println(day + " days");
	}

}
